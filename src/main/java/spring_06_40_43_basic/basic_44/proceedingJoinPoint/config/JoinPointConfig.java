package spring_06_40_43_basic.basic_44.proceedingJoinPoint.config;

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
@ComponentScan("spring_06_40_43_basic.basic_44.proceedingJoinPoint")
@EnableAspectJAutoProxy(exposeProxy = true)
public class JoinPointConfig {

}
