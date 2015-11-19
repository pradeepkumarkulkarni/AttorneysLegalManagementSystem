package com.procasi.alms.core.service.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.procasi.alms.core.bean.Profile;
import com.procasi.alms.core.service.ProfileService;

/**
 * The profile service implementation.
 * 
 * @author EdgarOlvera
 */
@Service
public class ProfileServiceImplementation implements ProfileService {

	@Override
	public Profile getProfile() {
		return null;
	}

	@Override
	public List<Profile> getAllProfiles() {
		System.out.println("getAllProfiles service");
		List<Profile> profiles = new ArrayList<Profile>();
		
		Profile profile = new Profile();
		profile.setIdProfile(88);
		profile.setName("Administrador");
		profile.setDescription("Profile with all access and privileges");
		profiles.add(profile);
		
		profile = new Profile();
		profile.setIdProfile(89);
		profile.setName("Licenciado");
		profile.setDescription("Profile with medium accesss");
		profiles.add(profile);
		
		profile = new Profile();
		profile.setIdProfile(91);
		profile.setName("Invitado");
		profile.setDescription("Profile with temporal accesss");
		profiles.add(profile);
		
		profile = new Profile();
		profile.setIdProfile(92);
		profile.setName("Secretario");
		profile.setDescription("Profile with almost all accesss");
		profiles.add(profile);
		return profiles;
	}

}
