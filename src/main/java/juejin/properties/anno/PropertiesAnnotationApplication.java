package juejin.properties.anno;

import juejin.properties.anno.bean.DataSource;
import juejin.properties.anno.config.PropertiesAnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PropertiesAnnotationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropertiesAnnotationConfig.class);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
