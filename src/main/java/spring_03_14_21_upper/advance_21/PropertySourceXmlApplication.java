package spring_03_14_21_upper.advance_21;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_03_14_21_upper.advance_21.bean.JdbcXmlProperty;
import spring_03_14_21_upper.advance_21.bean.JdbcYmlProperty;
import spring_03_14_21_upper.advance_21.config.JdbcXmlConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PropertySourceXmlApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcXmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcXmlProperty.class).toString());
        System.out.println(ctx.getBean(JdbcYmlProperty.class).toString());
    }
}
