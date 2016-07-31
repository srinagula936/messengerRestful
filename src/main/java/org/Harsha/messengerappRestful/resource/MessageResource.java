package org.Harsha.messengerappRestful.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Harsha.messengerappRestful.model.Message;
import org.Harsha.messengerappRestful.service.messageService;

@Path("/messages") //when there is a request to /messages in http url the methods inside of this will execute
public class MessageResource {
	
	messageService messageService = new messageService();
	
	
	
	@GET //get method which returns the get method
	//@Produces(MediaType.TEXT_PLAIN) //indicates the response is plain text
	@Produces(MediaType.APPLICATION_JSON) //indicates the response is xml response
	public List<Message> getMessages()
	{	
		return messageService.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message udpateMessage(@PathParam("messageId") long id, Message message)
	{
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id)
	{
		messageService.removeMessage(id);
	}
	
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id)
	{
		return messageService.getMessage(id);
	}
}
