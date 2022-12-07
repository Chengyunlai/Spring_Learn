package spring_06_40_43_basic.basic_42.logger;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Logger {
    public void beforePrint() {
        System.out.println("切面的before方法");
        System.out.println("Logger beforePrint run ......");
    }

    public Object afterPrint(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("切面的after方法");
        System.out.println("Logger afterPrint run ......");
        return pjp.proceed();
    }

    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }
}
