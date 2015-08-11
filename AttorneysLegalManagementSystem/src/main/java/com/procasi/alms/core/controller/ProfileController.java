package com.procasi.alms.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.procasi.alms.core.bean.Profile;
import com.procasi.alms.core.service.ProfileService;

/**
 * The Profile requests handler.
 * 
 * @author EdgarOlvera
 */
@Controller
@RequestMapping(value="profile")
public class ProfileController {

	/**
	 * The service injection.
	 */
	@Autowired
	ProfileService profileService;
	
	/**
	 * Handle the getProfile request.
	 * 
	 * @return a profile object.
	 */
	@ResponseBody
	@RequestMapping(value = "/getProfile", method = RequestMethod.GET)
	public Profile getProfile() {
		return this.profileService.getProfile();
	}
	
	/**
	 * Handle the getAllProfiles request.
	 * 
	 * @return a profiles list.
	 */
	@ResponseBody
	@RequestMapping(value="/getAllProfiles", method = RequestMethod.GET)
	public List<Profile> getAllProfiles() {
		return this.profileService.getAllProfiles();
	}
}
