package spring_08_53_66_jdbc.jdbc_55;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_08_53_66_jdbc.jdbc_55.service.UserService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ProgrammaticTransactionApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/Transaction.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }
}
