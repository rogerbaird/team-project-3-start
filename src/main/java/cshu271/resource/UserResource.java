package cshu271.resource;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/user")
public class UserResource
{
	private Logger logger = Logger.getLogger(UserResource.class.getName());

	/**
	 * Get the user by Id
	 * @param userId 
	 * @return Error Status.NOT_FOUND if userId isn't valid
	 *          User (json) if user is valid
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") Long userId)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /user/{id} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();

		////
	}

	/**
	 * Gets the list of article ids the user liked
	 * @param username
	 * @return Collection<Long> (json), or else empty list if no likes or username is invalid
	 */
	@GET
	@Path("/{username}/likes")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLikes(@PathParam("username") String username)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /user/{username}/likes not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////		
	}
	
	/**
	 * Gets the list of article ids the user disliked
	 * @param username
	 * @return Collection<Long> (json), or else empty list if no dislikes or username is invalid
	 */
	@GET
	@Path("/{username}/dislikes")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDislikes(@PathParam("username") String username)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /user/{username}/dislikes not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	
	}

	/**
	 * Indicates whether or not a username already exists
	 * @param username
	 * @return Boolean (json) indicating the existence of the username
	 */
	@GET
	@Path("/exists/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkUserExistence(@PathParam("username") String username)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /user/exists/{username} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}
	 
	/**
	 * Registers a user
	 * @param username
	 * @param password1
	 * @param password2
	 * @return Error Status.FORBIDDEN if the username isn't available (already exists)
	 *          Error Status.BAD_REQUEST if the passwords don't match or don't conform to password rules, optional String message 
	 *					to display to user if the username isn't available, the passwords don't match or don't conform to rules
	 *					(example: ErrorResponseBuilder.build(Status.BAD_REQUEST, "password too short"); )
	 *          User (json) the newly registered user
	 */
	@POST
	@Path("/register")
	@Produces(MediaType.APPLICATION_JSON)
	public Response register(@FormParam("username") String username, @FormParam("password1") String password1, @FormParam("password2") String password2)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "POST /user/register");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}

	/**
	 * Log the user in
	 * @param username
	 * @param password
	 * @return Error Status.UNAUTHORIZED if password is incorrect or username is not valid
	 *          UserToken (json) user's token for this session
	 */
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@FormParam("username") String username, @FormParam("password") String password)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "POST /user/login");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}

}
