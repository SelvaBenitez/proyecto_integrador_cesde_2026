package co.edu.cesde.pi.Service.impl;

import co.edu.cesde.pi.Repository.StudentsRepository;
import co.edu.cesde.pi.Service.StudentsService;
import co.edu.cesde.pi.models.Students;
import java.util.List;

public class StudentsServiceImpl implements StudentsService {

    private final StudentsRepository studentsRepository;

    public StudentsServiceImpl(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Students create(Students student) {

        if (isInvalidStudent(student)) {
            System.out.println("Error: Datos del estudiante inválidos o incompletos.");
            return null;
        }


        return studentsRepository.createStudent(student);
    }

    @Override
    public boolean update(Students updatestudent) {
        if (isInvalidStudent(updatestudent) || updatestudent.getStudent_Id() <= 0) {
            return false;
        }
        return studentsRepository.updateStudent(updatestudent);
    }

    @Override
    public boolean delete(Long student_Id) {
        if (student_Id == null || student_Id <= 0) {
            return false;
        }
        return studentsRepository.deleteStudent(student_Id);
    }

    @Override
    public Students findById(Long student_Id) {
        if (student_Id == null || student_Id <= 0) {
            return null;
        }
        return studentsRepository.findById(student_Id);
    }

    @Override
    public List<Students> findAll() {
        return studentsRepository.findAll();
    }

    @Override
    public Students findByDocumentNumber(String document_Number) {
        if (!isNotblank(document_Number)) {
            return null;
        }
        // Nota: En tu repositorio el método se llama finBydocumentNumber
        if (studentsRepository.finBydocumentNumber(document_Number)) {

            return findAll().stream()
                    .filter(s -> s.getDocument_Number().equals(document_Number))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }


    private boolean isInvalidStudent(Students student) {
        return student == null
                || !isNotblank(student.getCode())
                || !isNotblank(student.getDocument_Number())
                || !isNotblank(student.getFirst_Name())
                || !isNotblank(student.getLast_Name());
    }

    private boolean isNotblank(String value) {
        return value != null && !value.isBlank();
    }
}
