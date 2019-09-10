package cshu271.resource;

import cshu271.datastore.AccessDeniedException;
import cshu271.datastore.Articles;
import cshu271.datastore.NotFoundException;
import cshu271.value.Article;
import cshu271.value.UserToken;
import com.google.gson.Gson;
import cshu271.main.Authenticator;
import cshu271.main.ErrorResponseBuilder;
import cshu271.main.JsonResponseBuilder;
import java.util.Collection;
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

@Path("/article")
public class ArticleResource
{
	private Logger logger = Logger.getLogger(ArticleResource.class.getName());

	/**
	 * Get all articles
	 * @return Collection<Article> (json)	
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll()
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /article not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////	
	}
	
	/**
	 * Get all articles whose title contains the search text
	 * @param text - the search text
	 * @return Collection<Article> (json)
	 */
	@GET
	@Path("/search/{text}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response search(@PathParam("text") String text)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /article/search/{text} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////		
	}


	/**
	 * Validate the user token and record a vote from the given user on the given article
	 * @param articleId id of article to vote for
	 * @param userTokenStr string version of user token
	 * @param vote should be 1L, -1L, or 0L
	 * @return Error Status.BAD_REQUEST if article not found
	 *          Error Status.UNAUTHORIZED if user token is not valid
	 *          Article (json) if successful
	 */
	@POST
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response vote(@PathParam("id") Long articleId,
		@FormParam("userToken") String userTokenStr,
		@FormParam("vote") Long vote)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "POST /article/{id} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}

	/**
	 * Validate the user token and create a new article
	 * @param userTokenStr string version of user token	
	 * @param link web address of the article
	 * @param title title to display for the article
	 * @return Error Status.UNAUTHORIZED if user token not valid
	 *          Article (json) if successful
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(@FormParam("userToken") String userTokenStr,
		@FormParam("link") String link,
		@FormParam("title") String title)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "POST /article not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}
	
	/** 
	 * Validate the user token and delete an article
	 * @param articleId the article to delete
	 * @param userTokenStr string version of user token	
	 * @return Error Status.UNAUTHORIZED if user token not valid
	 *          Error Status.NOT_FOUND if article is not found
	 *          Empty json if successful
	 */
	@POST
	@Path("delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") Long articleId, @FormParam("userToken") String userTokenStr)
	{
		//// STUDENTS: Replace this code with your implementation:

		logger.log(Level.WARNING, "POST /article/delete/{id} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}
}
