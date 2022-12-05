package spring_06_40_43_basic.basic_44.proceedingJoinPoint.ustils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Aspect
// @Component
public class UserServiceAop {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("现在时间:yyyy年MM月dd日E HH时mm分ss秒");
    @Before("execution(public * spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService.* (..))")
    public void printTime(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("输出joinPoint:====>   "+ joinPoint);
        System.out.println("输出joinPoint.getTarget():====>   "+joinPoint.getTarget());
        System.out.println("输出joinPoint.getKind():====>   "+joinPoint.getKind());
        System.out.println("输出joinPoint.toLongString():====>   "+joinPoint.toLongString());
        System.out.println("输出joinPoint.toShortString():====>   "+joinPoint.toShortString());
        System.out.println("输出joinPoint.toString():====>   "+joinPoint.toString());
        System.out.println("输出joinPoint.getArgs():====>   "+ Arrays.toString(joinPoint.getArgs()));
        System.out.println("输出joinPoint.getSignature():====>   "+joinPoint.getSignature());
        System.out.println("输出joinPoint.getSourceLocation():====>   "+joinPoint.getSourceLocation());
        System.out.println("输出joinPoint.getStaticPart():====>   "+joinPoint.getStaticPart());
        System.out.println("输出joinPoint.getThis():====>   "+joinPoint.getThis());
        System.out.println("输出signature.getMethod():====>" + signature.getMethod());
        System.out.println("输出signature.getName():====>" + signature.getName());
        System.out.println("被拦截的类：" + joinPoint.getTarget().getClass().getName());
        System.out.println("被拦截的方法：" + ((MethodSignature) joinPoint.getSignature()).getMethod().getName());
        System.out.println("被拦截的方法参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println(simpleDateFormat.format(new Date().getTime()));
    }

    // 1.参数添加:Object retval; 2. 告诉SpringFramework 使用retval 接收返回参数 returning = "retval"
    @AfterReturning(value = "execution(public * spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean.UserService.getUserName (..)))",returning = "retval")
    public void afterReturningPrint(Object retval) {
        System.out.println("Logger afterReturningPrint run ......");
        System.out.println("返回的数据：" + retval);
    }
}
