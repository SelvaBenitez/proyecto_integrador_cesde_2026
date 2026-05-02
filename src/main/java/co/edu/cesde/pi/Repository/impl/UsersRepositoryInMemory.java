package co.edu.cesde.pi.Repository.impl;
import co.edu.cesde.pi.Repository.UsersRepository;
import co.edu.cesde.pi.models.Users;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemory implements UsersRepository {

    private List<Users> usersList;
    private long next_User_Id;

    public UsersRepositoryInMemory() {
        this.usersList = new ArrayList<>();
        this.next_User_Id = 1L;
    }

    @Override
    public Users createUser(Users user) {
        if (user == null) {
            return null;
        }

        if (existsByUsername(user.getUsername())) {
            return null;
        }

        user.setUser_Id(next_User_Id++);
        usersList.add(user);
        return user;
    }

    @Override
    public boolean updateUser(Users user) {
        if (user == null || user.getUser_Id() == 0) {
            return false;
        }

        for (Users u : usersList) {
            if (u.getUser_Id() != user.getUser_Id()
                    && u.getUsername().equals(user.getUsername())) {
                return false;
            }
        }

        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getUser_Id() == user.getUser_Id()) {
                usersList.set(i, user);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteUser(Long user_Id) {
        if (user_Id == null) {
            return false;
        }
        Users user = findById(user_Id);
        if (user == null) {
            return false;
        }
        return usersList.remove(user);
    }

    @Override
    public List<Users> findAll() {
        return new ArrayList<>(usersList);
    }

    @Override
    public Users findById(Long user_Id) {
        if (user_Id == null) {
            return null;
        }
        for (Users u : usersList) {
            if (u.getUser_Id() == user_Id) {
                return u;
            }
        }
        return null;
    }

    @Override
    public Users findByUsername(String username) {
        if (username == null || username.isBlank()) {
            return null;
        }
        for (Users u : usersList) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean existsById(Long user_Id) {
        return findById(user_Id) != null;
    }

    @Override
    public boolean existsByUsername(String username) {
        return findByUsername(username) != null;
    }
}