package spring_06_40_43_basic.basic_42.logger;

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

    public void afterPrint() {
        System.out.println("切面的after方法");
        System.out.println("Logger afterPrint run ......");
    }

    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }
}
