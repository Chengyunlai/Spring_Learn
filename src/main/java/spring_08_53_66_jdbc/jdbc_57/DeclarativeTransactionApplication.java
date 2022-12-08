package spring_08_53_66_jdbc.jdbc_57;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_08_53_66_jdbc.jdbc_57.config.DeclarativeTransactionConfiguration;
import spring_08_53_66_jdbc.jdbc_57.service.UserService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DeclarativeTransactionApplication {
    public static void main(String[] args) throws Exception {
        // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc_57.xml");
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(DeclarativeTransactionConfiguration.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }
}