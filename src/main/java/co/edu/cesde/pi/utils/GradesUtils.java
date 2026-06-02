package co.edu.cesde.pi.utils;

import co.edu.cesde.pi.models.Grades;
import co.edu.cesde.pi.exceptions.DatosInvalidosException;

public class GradesUtils {

    public static void validarNota(Grades grade) {
        if (grade == null) {
            throw new DatosInvalidosException("El objeto de calificación no puede ser nulo.");
        }
        if (grade.getStudent_id() <= 0) {
            throw new DatosInvalidosException("El ID del estudiante asociado debe ser mayor a cero.");
        }
        if (grade.getGroup_subject_id() <= 0) {
            throw new DatosInvalidosException("El ID de la materia/grupo debe ser mayor a cero.");
        }
        if (grade.getFinal_score() < 0.0 || grade.getFinal_score() > 5.0) {
            throw new DatosInvalidosException("La nota final debe estar entre 0.0 y 5.0.");
        }
    }
}