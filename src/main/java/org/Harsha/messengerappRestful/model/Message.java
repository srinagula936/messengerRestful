package org.Harsha.messengerappRestful.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //telling jax-b that this is root element
public class Message {
	private long id;
	private String messages;
	private Date createdjustnow;
	private String author;
	
	public Message()
	{
		
	}
	
	
	public Message(long id, String messages, String author) {
		
		this.id = id;
		this.messages = messages;
		this.author = author;
		this.createdjustnow = new Date(); 
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public Date getCreated() {
		return createdjustnow;
	}
	public void setCreated(Date created) {
		this.createdjustnow = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
