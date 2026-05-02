package co.edu.cesde.pi.Service.impl;

import co.edu.cesde.pi.Repository.GradesRepository;
import co.edu.cesde.pi.Service.GradesService;
import co.edu.cesde.pi.models.Grades;
import java.util.List;

public class GradesServiceImpl implements GradesService {

    private final GradesRepository gradesRepository;

    public GradesServiceImpl(GradesRepository gradesRepository) {
        this.gradesRepository = gradesRepository;
    }

    @Override
    public Grades create(Grades grade) {
        if (isInvalidGrade(grade)) {
            System.out.println("Error: Datos de la calificación inválidos o fuera de rango.");
            return null;
        }
        return gradesRepository.createGrade(grade);
    }

    @Override
    public boolean update(Grades updategrade) {
        if (isInvalidGrade(updategrade) || updategrade.getGroup_subject_id() <= 0) {
            return false;
        }
        return gradesRepository.updateGrade(updategrade);
    }

    @Override
    public boolean delete(Long grade_id) {
        if (grade_id == null || grade_id <= 0) {
            return false;
        }
        return gradesRepository.deleteGrade(grade_id);
    }

    @Override
    public Grades findById(Long grade_id) {
        if (grade_id == null || grade_id <= 0) {
            return null;
        }
        return gradesRepository.findById(grade_id);
    }

    @Override
    public List<Grades> findAll() {
        return gradesRepository.findAll();
    }

    @Override
    public List<Grades> findByStudentId(Long student_id) {
        if (student_id == null || student_id <= 0) {
            return new java.util.ArrayList<>();
        }
        return gradesRepository.findByStudentId(student_id);
    }


    private boolean isInvalidGrade(Grades grade) {
        if (grade == null) return true;

        boolean isScoreInvalid = grade.getFinal_score() < 0.0 || grade.getFinal_score() > 5.0;

        boolean areIdsInvalid = grade.getStudent_id() <= 0 || grade.getGroup_subject_id() <= 0;

        return isScoreInvalid || areIdsInvalid;
    }

    private boolean isNotblank(String value) {
        return value != null && !value.isBlank();
    }
}
