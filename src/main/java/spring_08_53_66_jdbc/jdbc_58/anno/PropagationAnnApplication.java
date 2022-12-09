package spring_08_53_66_jdbc.jdbc_58.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_08_53_66_jdbc.jdbc_58.anno.bean.UserService;
import spring_08_53_66_jdbc.jdbc_58.anno.config.PropagationConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PropagationAnnApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropagationConfig.class);
        UserService bean = ctx.getBean(UserService.class);
        bean.register();
    }
}
