package juejin.aopAnnotation;

import juejin.aopAnnotation.bean.UserService;
import juejin.aopAnnotation.config.AnnotationAopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AopAnnotationApplication {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationAopConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.login();
        Thread.sleep(1000);
        userService.logOut();
    }
}
