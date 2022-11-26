package juejin.beanLife.annoBean.config;

import juejin.beanLife.anno.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("juejin.beanLife.annoBean.bean")
public class BeanLifeConfig {
}
