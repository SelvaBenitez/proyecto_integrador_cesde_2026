package co.edu.cesde.pi.Service.impl;

import co.edu.cesde.pi.Repository.EnrollmentRepository;
import co.edu.cesde.pi.Service.EnrollmentService;
import co.edu.cesde.pi.models.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public Enrollment create(Enrollment enrollment) {
        if (isInvalidEnrollment(enrollment)) {
            System.out.println("Error: Datos de matrícula incompletos o inválidos.");
            return null;
        }

        return enrollmentRepository.createEnrollment(enrollment);
    }

    @Override
    public boolean update(Enrollment updateenrollment) {
        if (isInvalidEnrollment(updateenrollment)) {
            return false;
        }
        return enrollmentRepository.updateEnrollment(updateenrollment);
    }

    @Override
    public boolean delete(String enrollment_Id) {
        if (!isNotblank(enrollment_Id)) {
            return false;
        }
        return enrollmentRepository.deleteEnrollment(enrollment_Id);
    }

    @Override
    public Enrollment findById(String enrollment_Id) {
        if (!isNotblank(enrollment_Id)) {
            return null;
        }
        return enrollmentRepository.findById(enrollment_Id);
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public List<Enrollment> findByStudentId(long student_Id) {
        if (student_Id <= 0) {
            return new ArrayList<>();
        }
        return enrollmentRepository.findByStudentId(student_Id);
    }

    @Override
    public List<Enrollment> findByGroupId(String group_Id) {
        if (!isNotblank(group_Id)) {
            return new ArrayList<>();
        }
        return enrollmentRepository.findByGroupId(group_Id);
    }


    private boolean isInvalidEnrollment(Enrollment enrollment) {
        return enrollment == null
                || enrollment.getStudent_Id() <= 0
                || !isNotblank(enrollment.getEnrollment_Id())
                || !isNotblank(enrollment.getGroup_Id())
                || !isNotblank(enrollment.getPeriod_Id());
    }

    private boolean isNotblank(String value) {
        return value != null && !value.isBlank();
    }
}
