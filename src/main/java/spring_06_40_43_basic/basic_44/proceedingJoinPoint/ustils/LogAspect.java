package spring_06_40_43_basic.basic_44.proceedingJoinPoint.ustils;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description 多个切面的执行顺序
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
@Aspect
@Order(0)
public class LogAspect {

    @Before("execution(public * spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService.* (..))")
    public void printLog() {
        System.out.println("LogAspect 打印日志 ......");
    }

    @Around("execution(public void spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService.* (..))")
    public void aaa(){
        System.out.println("aaa");
    }

    @After("execution(public void spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService.* (..))")
    public void bbb(){
        System.out.println("bbb");
    }

}
