package spring_03_14_21_upper.advance_16.bean.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
import spring_03_14_21_upper.advance_16.bean.event.RegisterSuccessEvent;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
public class RegisterService implements ApplicationEventPublisherAware {
    // 具备事件广播器的发布事件的能力
    ApplicationEventPublisher publisher;

    public void register(String username) {
        // 用户注册的动作。。。
        System.out.println(username + "注册成功。。。");
        // 调用publishEvent，发布事件
        publisher.publishEvent(new RegisterSuccessEvent(username));
    }

    // 将Spring容器中管理的ApplicationEventPublisher赋值给我们定义的变量
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
