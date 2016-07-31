package org.Harsha.messengerappRestful.database;

import java.util.HashMap;
import java.util.Map;

import org.Harsha.messengerappRestful.model.Message;
import org.Harsha.messengerappRestful.model.Profile;

public class Database {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	
}
