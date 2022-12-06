package spring_07_45_47_upper.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("spring_07_45_47_upper")
public class TransactionAspectConfiguration {

}
