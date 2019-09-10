package cshu271.resource;

import cshu271.datastore.AccessDeniedException;
import cshu271.datastore.Comments;
import cshu271.value.Comment;
import cshu271.value.UserToken;
import cshu271.datastore.Articles;
import cshu271.datastore.NotFoundException;
import cshu271.main.Authenticator;
import cshu271.main.ErrorResponseBuilder;
import cshu271.main.JsonResponseBuilder;
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

@Path("/comment")
public class CommentResource
{
	private Logger logger = Logger.getLogger(CommentResource.class.getName());
	
	/**
	 * Retrieve the comments for the given article Id
	 *
	 * @param articleId
	 * @return Collection<Comment> (json), possibly empty
	 */
	@GET
	@Path("/{articleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByArticleId(@PathParam("articleId") Long articleId)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /comment/{articleId} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();

		////
	}

	/**
	 * Add a comment to an article
	 * @param articleId 
	 * @param userTokenStr token of logged-in user
	 * @param commentStr text of comment
	 * @return Error Status.UNAUTHORIZED if user token validation fails
	 *          Error Status.NOT_FOUND if articleId is not valid
	 *          Comment (json) if successful
	 */
	@POST
	@Path("/{articleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response postComment(@PathParam("articleId") Long articleId,
		@FormParam("userToken") String userTokenStr,
		@FormParam("comment") String commentStr)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "POST /comment/{articleId} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
		
		////
	}
	
    /**
	 * Get the number of comments for an article
	 * @param articleId
	 * @return Long (json)
	 */
	@GET
	@Path("/count/{articleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCountByArticleId(@PathParam("articleId") Long articleId)
	{
		//// STUDENTS: Replace this code with your implementation:
		
		logger.log(Level.WARNING, "GET /comment/count/{articleId} not implemented");
		return Response.status(Status.SERVICE_UNAVAILABLE).build();

		////		
	}

}
