/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.daniel.project.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Daniel
 */
@Path("/notes")
public class NotesMain {
    
    private Users User;
    
    @GET
    @Path("/user/{username}/{password}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response findUserById(@PathParam("username") String username, @PathParam("password") String password) {
        return Response.status(200).entity("teste").build();
        //return null;
    }

    @POST
    @Path("/adduser/{fname}/{lname}/{username}/{password}/{email}/{img}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(@PathParam("fname") String fname, @PathParam("lname") String lname, @PathParam("username") String username, @PathParam("password") String password, @PathParam("email") String email, @PathParam("img") String img) throws Exception {
        return Response.status(200).entity(User.addUser(fname, lname, username, password, email, img)).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNote() throws Exception {
        return null;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response editNote() throws Exception {        
        return null;
    }
    
    
    @DELETE
    @Path("/note/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteNote() throws Exception {
        return null;
    }
}
