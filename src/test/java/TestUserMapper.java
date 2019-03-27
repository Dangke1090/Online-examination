import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.Entity.User;
import cn.com.mapper.UserMapper;



public class TestUserMapper {
	
	private AbstractApplicationContext ac;
	private UserMapper userMapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext(
			"spring-dao.xml");
		userMapper = ac.getBean(
			"userMapper", UserMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	@Test
	public void getre() {
		Integer sex=1;
		Integer birthday=1;
		Integer birthyear=2;
		Integer birthmonth=3;
		String address="shanxi";
		String idcard="15615";
		String education ="ziji";
		Integer joinyear=1996;
		Integer joinmonth=12;
		Integer joinday=1;
		Integer partday=1;
		Integer partmonth=1;
		Integer partyear=2;
		String selprofessional="zhuanye";
		String seljob="buzhang";
		String selcommander="dada";
		String selbattalion="adad";
		String idnum="sadada";
		String selplatoon="ssasa";
		String selstate="sqq";
		String username="qwe";
		String name="dk";
				String password="123456";
				/*User user=new User(sex, name, username, birthday, birthyear, birthmonth,
						password, address, idcard, education, joinyear, joinmonth, joinday,
						partyear, partmonth, partday, selprofessional, seljob,
						idnum, selbattalion, selcommander, selplatoon, selstate);
				userMapper.insert(user);*/
	}


}
