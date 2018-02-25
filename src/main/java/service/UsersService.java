package service;

import model.Users;

import java.util.List;

public interface UsersService {
    void addUser(Users users);

    void updateUsers(Users users);

    void removeUser(int id);

    Users getUserById(int id);

    List<Users> listUsers();
}
