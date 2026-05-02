package co.edu.cesde.pi.Service.impl;

import co.edu.cesde.pi.Repository.UsersRepository;
import co.edu.cesde.pi.Service.UsersService;
import co.edu.cesde.pi.models.Users;
import java.util.List;

public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users create(Users user) {
        if (isInvalidUser(user)) {
            System.out.println("Error: Datos de usuario incompletos.");
            return null;
        }

        return usersRepository.createUser(user);
    }

    @Override
    public boolean update(Users updateuser) {
        if (isInvalidUser(updateuser) || updateuser.getUser_Id() <= 0) {
            return false;
        }
        return usersRepository.updateUser(updateuser);
    }

    @Override
    public boolean delete(Long user_Id) {
        if (user_Id == null || user_Id <= 0) {
            return false;
        }
        return usersRepository.deleteUser(user_Id);
    }

    @Override
    public Users findById(Long user_Id) {
        if (user_Id == null || user_Id <= 0) {
            return null;
        }
        return usersRepository.findById(user_Id);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users findByUsername(String username) {
        if (!isNotblank(username)) {
            return null;
        }
        return usersRepository.findByUsername(username);
    }



    private boolean isInvalidUser(Users user) {
        return user == null
                || !isNotblank(user.getUsername())
                || !isNotblank(user.getPassword_Hash());
    }

    private boolean isNotblank(String value) {
        return value != null && !value.isBlank();
    }
}
