package com.procasi.alms.core.service;

import java.util.List;

import com.procasi.alms.core.bean.Profile;

/**
 * The profile services.
 * 
 * @author EdgarOlvera
 */
public interface ProfileService {

	/**
	 * Gets a Profile by Id.
	 * 
	 * @return a Profile object.
	 */
	Profile getProfile();
	
	/**
	 * Gets all the profiles into a list.
	 * 
	 * @return the profile's list.
	 */
	List<Profile> getAllProfiles();
}
