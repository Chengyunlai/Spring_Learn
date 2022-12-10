package spring_08_53_66_jdbc.jdbc_61;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_08_53_66_jdbc.jdbc_61.config.TransactionListenerConfiguration;
import spring_08_53_66_jdbc.jdbc_61.service.UserService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class TransactionListenerApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                TransactionListenerConfiguration.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.saveUser();
    }
}
