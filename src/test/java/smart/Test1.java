package smart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smart.service.UserService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-test.xml")
public class Test1 {

	@Autowired
	private UserService userService;
	
	@Test
	public void test1(){
		userService.doTranfer("ding1", "ding2", 50);
	}
	
	@Test
	public void test2(){
		userService.selectUsers();
	}
	
	public void test3(){
		
	}
}
