import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.Entity.Job;
import cn.com.service.IJobService;
import cn.com.service.ISituationService;
import cn.com.service.ITypeService;

public class TestJobService {
	private AbstractApplicationContext ac;
	private ITypeService typeService;
	private ISituationService situationService;
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext(
			"spring-dao.xml", "spring-service.xml");
		situationService
			= ac.getBean("situationService", ISituationService.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}

	@Test
	public void getData1() {
		System.out.println(situationService.getDataes());
	}
	
}
