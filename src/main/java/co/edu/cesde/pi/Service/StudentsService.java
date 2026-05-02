package co.edu.cesde.pi.Service;

import co.edu.cesde.pi.models.Students;
import java.util.List;

public interface StudentsService {

    Students create(Students student);

    boolean update(Students updateStudent);

    boolean delete(Long student_Id);

    Students findById(Long student_Id);

    List<Students> findAll();

    Students findByDocumentNumber(String document_Number);
}