package co.edu.cesde.pi.utils;

import co.edu.cesde.pi.models.Students;
import co.edu.cesde.pi.exceptions.DatosInvalidosException;

public class StudentsUtils {

    public static void validarEstudiante(Students student) {
        if (student == null) {
            throw new DatosInvalidosException("El espacio del estudiante no puede ser nulo.");
        }
        if (isBlank(student.getCode())) {
            throw new DatosInvalidosException("El código del estudiante es obligatorio.");
        }
        if (isBlank(student.getDocument_Number())) {
            throw new DatosInvalidosException("El número de documento del estudiante es obligatorio.");
        }
        if (isBlank(student.getFirst_Name())) {
            throw new DatosInvalidosException("El nombre del estudiante es obligatorio.");
        }
        if (isBlank(student.getLast_Name())) {
            throw new DatosInvalidosException("El apellido del estudiante es obligatorio.");
        }
    }

    private static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}