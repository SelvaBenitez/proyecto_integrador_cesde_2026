package co.edu.cesde.pi.Repository.impl;

import co.edu.cesde.pi.Repository.GradesRepository;
import co.edu.cesde.pi.models.Grades;

import java.util.ArrayList;
import java.util.List;

public class GradesRepositoryInMemory implements GradesRepository {

    private List<Grades> gradesList;
    private long next_grade_id;

    public GradesRepositoryInMemory() {
        this.gradesList = new ArrayList<>();
        this.next_grade_id = 1L;
    }

    @Override
    public Grades createGrade(Grades grade) {
        if (grade == null) {
            return null;
        }

        grade.setGroup_subject_id(next_grade_id++);
        gradesList.add(grade);
        return grade;
    }

    @Override
    public boolean updateGrade(Grades grade) {
        if (grade == null || grade.getGroup_subject_id() == 0) {
            return false;
        }

        for (int i = 0; i < gradesList.size(); i++) {
            if (gradesList.get(i).getGroup_subject_id() == grade.getGroup_subject_id()) {
                gradesList.set(i, grade);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean deleteGrade(Long grade_id) {
        if (grade_id == null) {
            return false;
        }
        Grades grade = findById(grade_id);
        if (grade == null) {
            return false;
        }
        return gradesList.remove(grade);
    }

    @Override
    public List<Grades> findAll() {
        return new ArrayList<>(gradesList);
    }

    @Override
    public Grades findById(Long grade_id) {
        if (grade_id == null) {
            return null;
        }
        for (Grades g : gradesList) {
            if (g.getGroup_subject_id() == grade_id) {
                return g;
            }
        }
        return null;
    }

    @Override
    public List<Grades> findByStudentId(Long student_id) {
        List<Grades> studentGrades = new ArrayList<>();
        if (student_id == null) {
            return studentGrades;
        }
        for (Grades g : gradesList) {
            if (g.getStudent_id() == student_id) {
                studentGrades.add(g);
            }
        }
        return studentGrades;
    }

    @Override
    public boolean existsById(Long grade_id) {
        return findById(grade_id) != null;
    }
}