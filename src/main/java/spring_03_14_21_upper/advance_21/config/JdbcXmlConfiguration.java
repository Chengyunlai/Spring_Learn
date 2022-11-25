package spring_03_14_21_upper.advance_21.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring_03_14_21_upper.advance_21.factory.YmlPropertySourceFactory;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("spring_03_14_21_upper.advance_21.bean")
@PropertySource("classpath:advance/jdbc.xml")
@PropertySource(value = "classpath:advance/jdbc.yml", factory = YmlPropertySourceFactory.class)
public class JdbcXmlConfiguration {
}
