package eu.kielczewski.example.resource;

import eu.kielczewski.example.dao.UserDao;
import eu.kielczewski.example.model.User;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserDao userDao;

    @Inject
    public UserResource(final UserDao userDao) {
        this.userDao = userDao;
    }

    @GET
    @Path("/{id}")
    public User getUser(@PathParam("id") long id) {
        return userDao.getById(id);
    }

    @POST
    public User addUser(@Valid User user) {
        return userDao.save(user);
    }

}