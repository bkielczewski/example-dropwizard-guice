package eu.kielczewski.example.dao;

import com.google.inject.persist.Transactional;
import eu.kielczewski.example.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public User getById(long id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional
    public User save(User user) {
        em.persist(user);
        return user;
    }

}
