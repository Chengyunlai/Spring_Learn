package juejin.aopXml;

import juejin.aopXml.bean.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AopXmlApplication {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("juejin/aopXml/xmlAop.xml");
        UserService userService = ctx.getBean(UserService.class);
        userService.login();
        Thread.sleep(1000);
        userService.logOut();
    }
}
