package spring_03_14_21_upper.advance_16.bean.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import spring_03_14_21_upper.advance_16.bean.event.RegisterSuccessEvent;

/**
 * @ClassName
 * @Description 监听事件，发送站内信
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class MessageSenderListener {

    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent registerSuccessEvent){
        System.out.println("监听到用户注册成功，发送站内信...");
    }
}