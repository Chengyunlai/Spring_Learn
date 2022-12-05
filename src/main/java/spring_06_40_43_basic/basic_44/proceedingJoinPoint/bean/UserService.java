package spring_06_40_43_basic.basic_44.proceedingJoinPoint.bean;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class UserService {
    public void login(String username){
        String userName = ((UserService) AopContext.currentProxy()).getUserName();
        System.out.println("用户登录");
        System.out.println(userName);
    }

    public void logOut(){
        System.out.println("用户登出");
    }

    public String getUserName(){
        return "程云来";
    }
}
