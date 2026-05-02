package co.edu.cesde.pi.Service;

import co.edu.cesde.pi.models.Grades;
import java.util.List;

public interface GradesService {

    Grades create(Grades grade);

    boolean update(Grades updategrade);

    boolean delete(Long grade_id);

    Grades findById(Long grade_id);

    List<Grades> findAll();

    List<Grades> findByStudentId(Long student_id);
}
