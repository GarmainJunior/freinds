package service;

import dao.UsersDao;
import model.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
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
    @Transactional
    public void removeUser(int id) {
    this.usersDao.removeUser(id);
    }

    @Override
    @Transactional
    public Users getUserById(int id) {
        return this.usersDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<Users> listUsers() {
        return this.usersDao.listUsers();
    }
}
