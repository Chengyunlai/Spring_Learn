package spring_02_06_13_basic.basic_13.bean.byInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Box implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("box的初始方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("box的销毁方法");
    }
}
