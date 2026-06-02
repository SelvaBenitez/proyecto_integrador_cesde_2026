package co.edu.cesde.pi.utils;

import co.edu.cesde.pi.models.Enrollment;
import co.edu.cesde.pi.exceptions.DatosInvalidosException;

public class EnrollmentUtils {

    public static void validarMatricula(Enrollment enrollment) {
        if (enrollment == null) {
            throw new DatosInvalidosException("El objeto de matrícula no puede ser nulo.");
        }
        if (enrollment.getStudent_Id() <= 0) {
            throw new DatosInvalidosException("El ID del estudiante para la matrícula debe ser mayor a cero.");
        }
        if (isBlank(enrollment.getEnrollment_Id())) {
            throw new DatosInvalidosException("El ID de la matrícula es obligatorio.");
        }
        if (isBlank(enrollment.getGroup_Id())) {
            throw new DatosInvalidosException("El ID del grupo es obligatorio.");
        }
        if (isBlank(enrollment.getPeriod_Id())) {
            throw new DatosInvalidosException("El ID del periodo  es obligatorio.");
        }
    }

    private static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}