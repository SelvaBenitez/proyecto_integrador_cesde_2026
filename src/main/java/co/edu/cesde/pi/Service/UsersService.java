package co.edu.cesde.pi.Service;

import co.edu.cesde.pi.models.Users;
import java.util.List;

public interface UsersService {

    Users create(Users user);

    boolean update(Users updateuser);

    boolean delete(Long user_Id);

    Users findById(Long user_Id);

    List<Users> findAll();

    Users findByUsername(String username);
}
