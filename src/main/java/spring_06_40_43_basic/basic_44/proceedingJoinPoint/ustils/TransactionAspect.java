package spring_06_40_43_basic.basic_44.proceedingJoinPoint.ustils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * @ClassName
 * @Description 多个切面的执行顺序
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
@Aspect
public class TransactionAspect implements Ordered {

    @Before("execution(public void spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService.* (..))")
    public void beginTransaction() {
        System.out.println("TransactionAspect 开启事务 ......");
    }

    @Override
    public int getOrder() {
        return 2147483646;
    }
}