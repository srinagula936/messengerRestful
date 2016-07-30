package org.Harsha.messengerappRestful.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Harsha.messengerappRestful.model.Message;
import org.Harsha.messengerappRestful.service.messageService;

@Path("/messages") //when there is a request to /messages in http url the methods inside of this will execute
public class MessageResource {
	
	messageService messageService = new messageService();
	
	
	
	@GET //get method which returns the get method
	//@Produces(MediaType.TEXT_PLAIN) //indicates the response is plain text
	@Produces(MediaType.APPLICATION_XML) //indicates the response is xml response
	public List<Message> getMessages()
	{	
		return messageService.getAllMessages();
	}
}
