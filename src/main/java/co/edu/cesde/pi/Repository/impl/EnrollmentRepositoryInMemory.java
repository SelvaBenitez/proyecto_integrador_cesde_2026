package co.edu.cesde.pi.Repository.impl;

import co.edu.cesde.pi.Repository.EnrollmentRepository;
import co.edu.cesde.pi.models.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepositoryInMemory implements EnrollmentRepository {

    private List<Enrollment> enrollmentList;

    public EnrollmentRepositoryInMemory() {
        this.enrollmentList = new ArrayList<>();
    }

    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        if (enrollment == null) {
            return null;
        }

        if (existsById(enrollment.getEnrollment_Id())) {
            return null;
        }

        enrollmentList.add(enrollment);
        return enrollment;
    }

    @Override
    public boolean updateEnrollment(Enrollment enrollment) {
        if (enrollment == null || enrollment.getEnrollment_Id() == null) {
            return false;
        }

        for (int i = 0; i < enrollmentList.size(); i++) {
            if (enrollmentList.get(i).getEnrollment_Id().equals(enrollment.getEnrollment_Id())) {
                enrollmentList.set(i, enrollment);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean deleteEnrollment(String enrollment_Id) {
        if (enrollment_Id == null) {
            return false;
        }
        Enrollment enrollment = findById(enrollment_Id);
        if (enrollment == null) {
            return false;
        }
        return enrollmentList.remove(enrollment);
    }

    @Override
    public List<Enrollment> findAll() {
        return new ArrayList<>(enrollmentList);
    }

    @Override
    public Enrollment findById(String enrollment_Id) {
        if (enrollment_Id == null) {
            return null;
        }
        for (Enrollment e : enrollmentList) {
            if (e.getEnrollment_Id().equals(enrollment_Id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Enrollment> findByStudentId(long student_Id) {
        List<Enrollment> studentEnrollments = new ArrayList<>();
        for (Enrollment e : enrollmentList) {
            if (e.getStudent_Id() == student_Id) {
                studentEnrollments.add(e);
            }
        }
        return studentEnrollments;
    }

    @Override
    public List<Enrollment> findByGroupId(String group_Id) {
        List<Enrollment> groupEnrollments = new ArrayList<>();
        if (group_Id == null) return groupEnrollments;

        for (Enrollment e : enrollmentList) {
            if (e.getGroup_Id().equals(group_Id)) {
                groupEnrollments.add(e);
            }
        }
        return groupEnrollments;
    }

    @Override
    public boolean existsById(String enrollment_Id) {
        return findById(enrollment_Id) != null;
    }
}
