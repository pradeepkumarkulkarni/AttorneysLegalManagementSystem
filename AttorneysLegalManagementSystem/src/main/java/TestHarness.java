import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.service.UserService;

@Component
public class TestHarness {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/config/Beans.xml");
		
	    	UserService service = (UserService)appContext.getBean("userService");
	    	
//		UserServiceImplementation service = new UserServiceImplementation();
		
	    	List<User> list = service.getAllUsers();
	    	System.out.println("size in main: " + list.size());
	    	for (User u : list) {
	    		System.out.println("getIdUser: " + u.getIdUser());
	    		System.out.println("getLastLoginDate: " + u.getLastLoginDate());
	    		System.out.println("getName: " + u.getName());
	    		System.out.println("getPass: " + u.getPass());
	    		System.out.println("getProfile: " + u.getProfile());
	    		System.out.println("getStatus" + u.getStatus());
	    	}
	}
}
