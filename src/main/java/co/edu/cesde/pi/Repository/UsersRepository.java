package co.edu.cesde.pi.Repository;
import co.edu.cesde.pi.models.Users;
import java.util.List;

public interface UsersRepository {
    Users createUser(Users user);

    boolean updateUser(Users user);

    boolean deleteUser(Long user_Id); // Usamos Long para compatibilidad con IDs nulos en objetos

    List<Users> findAll();

    Users findById(Long user_Id);

    Users findByUsername(String username);

    boolean existsById(Long user_Id);

    boolean existsByUsername(String username);
}
