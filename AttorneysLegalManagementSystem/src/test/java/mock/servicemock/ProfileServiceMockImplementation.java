package mock.servicemock;

import java.util.ArrayList;
import java.util.List;

import com.procasi.alms.core.bean.Profile;
import com.procasi.alms.core.service.ProfileService;

/**
 * The profile service mock, for test purposes.
 * 
 * @author EdgarOlvera
 */
public class ProfileServiceMockImplementation implements ProfileService {

	@Override
	public Profile getProfile() {
		System.out.println("getProfile service mock");
		Profile profile = new Profile();
		profile.setIdProfile(78);
		profile.setName("Administrador");
		profile.setDescription("Profile with all access and privileges");
		return profile;
	}

	@Override
	public List<Profile> getAllProfiles() {
		System.out.println("getAllProfiles service mock");
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
