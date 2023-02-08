package org.nutry.services;

import org.nutry.models.UserModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/V1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface UserService {

    @GET
    @Path("Users")
    public List<UserModel> getUsers();
}
