import java.util.List;

import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.service.serviceimplementation.UserServiceImplementation;


public class TestHarness {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		ApplicationContext appContext = 
//	    		new ClassPathXmlApplicationContext("config/Beans.xml");
//		
//	    	UserDao userDao = (UserDao)appContext.getBean("userDao");
	    	
		UserServiceImplementation service = new UserServiceImplementation();
		
	    	List<User> list = service.getAllUsers();
	    	System.out.println("size in main: " + list.size());
	}

}
