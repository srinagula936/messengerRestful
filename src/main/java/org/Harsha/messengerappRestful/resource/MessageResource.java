package org.Harsha.messengerappRestful.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages") //when there is a request to /messages in http url the methods inside of this will execute
public class MessageResource {
	
	@GET //get method which returns the get method
	@Produces(MediaType.TEXT_PLAIN) //indicates the response is plain text
	public String getMessages()
	{	
		return "Hello World";
	}
}
