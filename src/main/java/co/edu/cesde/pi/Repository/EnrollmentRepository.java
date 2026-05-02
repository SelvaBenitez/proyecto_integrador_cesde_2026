package co.edu.cesde.pi.Repository;
import co.edu.cesde.pi.models.Enrollment;
import java.util.List;

public interface EnrollmentRepository {
    Enrollment createEnrollment(Enrollment enrollment);

    boolean updateEnrollment(Enrollment enrollment);

    boolean deleteEnrollment(String enrollment_Id);

    List<Enrollment> findAll();

    Enrollment findById(String enrollment_Id);

    List<Enrollment> findByStudentId(long student_Id);

    List<Enrollment> findByGroupId(String group_Id);

    boolean existsById(String enrollment_Id);
}
