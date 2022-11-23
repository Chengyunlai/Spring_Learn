package spring_03_14_21_upper.advance_17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_03_14_21_upper.advance_17.bean.Bartender;
import spring_03_14_21_upper.advance_17.bean.Boss;
import spring_03_14_21_upper.advance_17.config.TavernConfiguration;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class TavernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------");
        Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
        bartenders.forEach((name, bartender) -> System.out.println(bartender));
    }
}
