package juejin.aopAnnotation.bean;

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
    public void login(){
        System.out.println("用户登录");
    }

    public void logOut(){
        System.out.println("用户登出");
    }
}
