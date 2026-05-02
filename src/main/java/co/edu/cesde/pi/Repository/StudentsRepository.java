package co.edu.cesde.pi.Repository;
import co.edu.cesde.pi.models.Students;
import java.util.List;

public interface StudentsRepository {
    Students createStudent(Students student);

    boolean updateStudent(Students student);

    boolean deleteStudent(Long studentId);

    boolean finBydocumentNumber(String documentNumber);

    List<Students> findAll();

    Students findById(Long studentId);

    Students findByDocumentNumber(String documentNumber);

    boolean existsById(Long studentId);

    boolean existsByDocumentNumber(String documentNumber);
}
