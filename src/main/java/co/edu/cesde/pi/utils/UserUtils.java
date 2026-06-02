package co.edu.cesde.pi.utils;

import co.edu.cesde.pi.models.Users;
import co.edu.cesde.pi.exceptions.DatosInvalidosException;

public class UserUtils {

    public static void validarUsuario(Users user) {
        if (user == null) {
            throw new DatosInvalidosException("El objeto usuario no puede ser nulo.");
        }
        if (isBlank(user.getUsername())) {
            throw new DatosInvalidosException("El nombre de usuario es obligatorio.");
        }
        if (isBlank(user.getPassword_Hash())) {
            throw new DatosInvalidosException("La contraseña es obligatoria.");
        }
    }

    private static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}