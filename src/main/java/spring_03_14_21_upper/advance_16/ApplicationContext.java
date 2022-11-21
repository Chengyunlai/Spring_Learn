package spring_03_14_21_upper.advance_16;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_03_14_21_upper.advance_16.bean.service.RegisterService;
import spring_03_14_21_upper.advance_16.config.ListenerConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ApplicationContext {
    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ListenerConfig.class);
        System.out.println("IOC容器初始化完成");
        RegisterService bean = ctx.getBean(RegisterService.class);
        bean.register("程云来");
        ctx.close();
        System.out.println("IOC容器关闭");
    }
}
