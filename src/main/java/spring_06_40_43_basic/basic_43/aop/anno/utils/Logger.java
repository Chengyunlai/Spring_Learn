package spring_06_40_43_basic.basic_43.aop.anno.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description 环绕通知的执行时机比单个通知要早。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Aspect
@Component
public class Logger {
    // AspectJ注解抽取
    @Pointcut("execution(public * spring_06_40_43_basic.basic_43.aop.anno.service.FinanceService.* (..))")
    public void defaultPointcut() {

    }

    // 引用抽取的切入点表达式
    @Before("defaultPointcut()")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }

    @AfterReturning("defaultPointcut()")
    public void afterReturningPrint(){

    }

    @AfterThrowing("@annotation(spring_06_40_43_basic.basic_43.aop.anno.annotation.Log)")
    public void annotation(){
        System.out.println("使用自定义注解的方式可以在原有的方法上加注解进行增强");
    }

    @Around("execution(public * spring_06_40_43_basic.basic_43.aop.anno.service.FinanceService.* (..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint){
        System.out.println("围绕 ......");
        // joinPoint 有一个 proceed 方法，执行了它，就相当于之前咱在动态代理中写的 method.invoke(target, args); 方法了：
        try {
            Object retVal = joinPoint.proceed();
            return retVal;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally {
            System.out.println("围绕结束 ......");
        }
        return null;
    }
}
