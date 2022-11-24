package juejin.properties.anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("juejin.properties.anno.bean")
@PropertySource("juejin/properties/data.properties")
public class PropertiesAnnotationConfig {
}
