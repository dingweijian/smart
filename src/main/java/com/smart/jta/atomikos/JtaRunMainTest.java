package com.smart.jta.atomikos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.jta.atomikos.service.BankAccountService;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public class JtaRunMainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("------------start");
        ApplicationContext appCt = new ClassPathXmlApplicationContext(
                "jta.spring.xml");
        System.out.println("------------finished init xml");

        Object bean = appCt.getBean("bankAccountServiceProxy");
        System.out.println(bean.getClass());
        BankAccountService service = (BankAccountService) bean;
       // service.doTestTransfer("husband", "wife", 2000);
    }
}
