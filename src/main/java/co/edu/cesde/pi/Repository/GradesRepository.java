package co.edu.cesde.pi.Repository;
import co.edu.cesde.pi.models.Grades;
import java.util.List;

public interface GradesRepository {
    Grades createGrade(Grades grade);

    boolean updateGrade(Grades grade);

    boolean deleteGrade(Long grade_id);

    List<Grades> findAll();

    Grades findById(Long grade_id);

    List<Grades> findByStudentId(Long student_id);

    boolean existsById(Long grade_id);

}
