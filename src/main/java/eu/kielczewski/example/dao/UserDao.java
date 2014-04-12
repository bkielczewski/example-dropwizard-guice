package eu.kielczewski.example.dao;

import eu.kielczewski.example.model.User;

public interface UserDao {

    User getById(long id);

    User save(User user);

}
