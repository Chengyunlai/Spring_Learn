package juejin.autowrite;

import juejin.autowrite.config.AutoWriteConfig;
import juejin.autowrite.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AutoWriteConfig.class);
        UserServiceImpl bean = ctx.getBean(UserServiceImpl.class);
        String name = bean.getUserNameByID();
        System.out.println(name);

    }
}
