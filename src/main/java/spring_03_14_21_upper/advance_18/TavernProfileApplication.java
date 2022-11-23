package spring_03_14_21_upper.advance_18;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_03_14_21_upper.advance_18.config.TavernConfiguration;

import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class TavernProfileApplication {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // ctx.getEnvironment().setActiveProfiles("city");
        ctx.register(TavernConfiguration.class);
        ctx.getBeanDefinitionNames();
        ctx.refresh();
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        // 给ApplicationContext的环境设置正在激活的profile
    }
}
