package co.edu.cesde.pi.Repository.impl;
import co.edu.cesde.pi.Repository.StudentsRepository;
import co.edu.cesde.pi.models.Students;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentsRepository {
    private List<Students> studentsList;
    private long next_Student_Id;

    public StudentRepositoryInMemory() {
        this.studentsList = new ArrayList<>();
        this.next_Student_Id = 1L;
    }

    @Override
    public Students createStudent(Students student) {
        if (student == null) {
            return null;
        }
        // Validamos si ya existe el documento antes de crear
        if (existsByDocumentNumber(student.getDocument_Number())) {
            return null;
        }

        student.setStudent_Id(next_Student_Id++);
        studentsList.add(student);
        return student;
    }

    @Override
    public boolean deleteStudent(Long studentId) {
        if (studentId == null) {
            return false;
        }
        Students student = findById(studentId);
        if (student == null) {
            return false;
        }
        return studentsList.remove(student);
    }

    @Override
    public boolean updateStudent(Students student) {
        if (student == null || student.getStudent_Id() == 0) {
            return false;
        }

        // Verificamos que el documento no lo tenga OTRO estudiante distinto
        for (Students s : studentsList) {
            if (s.getStudent_Id() != student.getStudent_Id()
                    && s.getDocument_Number().equals(student.getDocument_Number())) {
                return false; // Conflicto de documento
            }
        }

        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getStudent_Id() == student.getStudent_Id()) {
                studentsList.set(i, student);
                return true;
            }
        }
        return false;
    }

    @Override
    public Students findById(Long studentId) {
        if (studentId == null) {
            return null;
        }
        for (Students s : studentsList) {
            if (s.getStudent_Id() == studentId) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Students findByDocumentNumber(String documentNumber) {
        return null;
    }

    @Override
    public boolean finBydocumentNumber(String documentNumber) {
        // Mantenemos el nombre de tu método aunque falte la 'd'
        return existsByDocumentNumber(documentNumber);
    }

    @Override
    public List<Students> findAll() {
        return new ArrayList<>(studentsList);
    }

    @Override
    public boolean existsById(Long studentId) {
        return findById(studentId) != null;
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }
        for (Students s : studentsList) {
            if (s.getDocument_Number().equals(documentNumber)) {
                return true;
            }
        }
        return false;
    }

}
