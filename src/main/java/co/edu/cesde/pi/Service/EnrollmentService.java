package co.edu.cesde.pi.Service;

import co.edu.cesde.pi.models.Enrollment;
import java.util.List;

public interface EnrollmentService {

    Enrollment create(Enrollment enrollment);

    boolean update(Enrollment updateenrollment);

    boolean delete(String enrollment_Id);

    Enrollment findById(String enrollment_Id);

    List<Enrollment> findAll();

    List<Enrollment> findByStudentId(long student_Id);

    List<Enrollment> findByGroupId(String group_Id);
}