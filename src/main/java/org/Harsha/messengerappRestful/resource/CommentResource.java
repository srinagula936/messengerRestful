package org.Harsha.messengerappRestful.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	public String test()
	{
		return "new sub resource";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("commentId") long commentId)
	{
		return "method to return comment " + commentId ;
	}
}
