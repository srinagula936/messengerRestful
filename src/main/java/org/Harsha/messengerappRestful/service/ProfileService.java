package org.Harsha.messengerappRestful.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.Harsha.messengerappRestful.database.Database;
import org.Harsha.messengerappRestful.model.Message;
import org.Harsha.messengerappRestful.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles = Database.getProfiles();
	
	public ProfileService()
	{
		profiles.put("Harsha", new Profile(1L,"harsha","sri","nagula"));
	}



public List<Profile> getAllProfiles()
{
	return new ArrayList<Profile>(profiles.values());
}

public Profile getProfile(String profileName)
{
	return profiles.get(profileName);
}

public Profile addProfile(Profile profile)
{
	profile.setId(profiles.size() + 1);
	profiles.put(profile.getProfileName(),profile);
	return profile;
}

public Profile updateProfile(Profile profile)
{
	if(profile.getProfileName().isEmpty())
	{
		return null;
	}
	
	profiles.put(profile.getProfileName(), profile);
	return profile;
}

public Profile removeProfile(String profileName)
{
	
	return profiles.remove(profileName);
}


}