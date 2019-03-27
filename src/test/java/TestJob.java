import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.Entity.Job;
import cn.com.mapper.JobMapper;

public class TestJob {
	private AbstractApplicationContext ac;
	private JobMapper jobMapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext(
			"spring-dao.xml");
		jobMapper = ac.getBean(
			"jobMapper", JobMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	
	@Test
	public void insert() {
		String jobName="buzhang,yingzhang,paizhang";
		Integer id=3;
		Job job=new Job(1,jobName);
		jobMapper.insert(job);	
	}
}
