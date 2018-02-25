package service;

import dao.UsersDao;
import model.Users;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UsersServiceImpl implements  UsersService {

    private UsersDao usersDao;

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    @Transactional
    public void addUser(Users users) {
    this.usersDao.addUser(users);
    }

    @Override
    @Transactional
    public void updateUsers(Users users) {
        this.usersDao.updateUsers(users);

    }

    @Override
    public void removeUser(int id) {
    this.usersDao.removeUser(id);
    }

    @Override
    public Users getUserById(int id) {
        return this.usersDao.getUserById(id);
    }

    @Override
    public List<Users> listUsers() {
        return this.usersDao.listUsers();
    }
}
