package dao;

import model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.logging.Logger;

public class UsersDaoImpl implements UsersDao {

    private static final Logger logger = Logger.getLogger(UsersDaoImpl.class.getName());

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(Users users) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(users);
        logger.info("user add " + users);
        }

    @Override
    public void updateUsers(Users users) {
    Session session = this.sessionFactory.getCurrentSession();
    session.update(users);
    logger.info("user update " + users);
    }

    @Override
    public void removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
    Users users = (Users) session.load(Users.class , new Integer(id));
        if(users!=null){
            session.delete(users);
        }
        logger.info("user delete. User details  " + users);
    }

    @Override
    public Users getUserById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Users users = (Users)session.load(Users.class, new Integer(id));
        logger.info("user loaded. User details" + users);
        return users;
    }

    @Override
    public List<Users> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Users> usersList = session.createQuery("from Users").list();
            for (Users users : usersList){
                logger.info("User list" + users);
            }
            return usersList;
    }
}
