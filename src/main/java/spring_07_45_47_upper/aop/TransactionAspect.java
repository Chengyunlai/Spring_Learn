package spring_07_45_47_upper.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import spring_07_45_47_upper.utils.JdbcUtils;

import java.sql.Connection;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
@Aspect
public class TransactionAspect {
    @Around("@annotation(spring_07_45_47_upper.anno.Transactional)")
    public Object doWithTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        Connection connection = JdbcUtils.getConnection();
        //开启事务
        connection.setAutoCommit(false);
        try {
            // 执行原始方法，在Service中需要是特定的的方法才需要事务，我们用注解的方式
            Object proceed = joinPoint.proceed();
            // 方法执行成功，提交事务
            connection.commit();
            return proceed;
        }catch (Exception e){
            // 方法出现异常，回滚事务
            connection.rollback();
            throw e;
        }finally {
            connection.close();
        }
    }
}
