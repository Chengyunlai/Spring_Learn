package spring_08_53_66_jdbc.jdbc_58;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_08_53_66_jdbc.jdbc_58.service.PointService;
import spring_08_53_66_jdbc.jdbc_58.service.UserService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PropagationApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc_58.xml");
        UserService bean = ctx.getBean(UserService.class);
        bean.register();
        PointService bean1 = ctx.getBean(PointService.class);
        System.out.println(bean1);
    }
}
