import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.IJobService;
import cn.com.service.IUserService;

public class testUser {
	private AbstractApplicationContext ac;
	private IUserService userService;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext(
			"spring-dao.xml", "spring-service.xml");
		userService
			= ac.getBean("userService", IUserService.class);
	}
	@Test
	public void getname() {
		System.out.println(userService.byname());
	}
}
