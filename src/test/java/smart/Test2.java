package smart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smart.jta.atomikos.service.BankAccountService;
import com.smart.jta.atomikos.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-jta-test.xml")
public class Test2 {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private BankAccountService bankAccountService;
	
	
	@Test
	public void test1(){
		
		userInfoService.selectUserInfo();
	}
	
	@Test
	public void test2(){
		bankAccountService.selectBankAccount();
	}
	
	@Test
	public void test3(){
		try {
			bankAccountService.doTestTransfer("", "", 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
