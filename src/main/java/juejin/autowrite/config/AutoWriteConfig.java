package juejin.autowrite.config;

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
@ComponentScan("juejin.autowrite")
@PropertySource("juejin/autowrite/daoName.properties")
public class AutoWriteConfig {
}
