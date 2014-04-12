package eu.kielczewski.example.dropwizard.dao;

import eu.kielczewski.example.dropwizard.model.User;

public interface UserDao {

    User getById(long id);

    User save(User user);

}
