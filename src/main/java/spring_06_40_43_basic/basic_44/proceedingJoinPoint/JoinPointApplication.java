package spring_06_40_43_basic.basic_44.proceedingJoinPoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService;
import spring_06_40_43_basic.basic_44.proceedingJoinPoint.config.JoinPointConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JoinPointApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JoinPointConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.login("程云来");
        // userService.getUserName();
    }
}
