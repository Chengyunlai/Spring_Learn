package spring_03_14_21_upper.advance_16.bean.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_03_14_21_upper.advance_16.bean.event.RegisterSuccessEvent;

/**
 * @ClassName
 * @Description 监听事件，发送邮件
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
// 改变执行的顺序
@Order(0)
public class EmailSenderListener implements ApplicationListener<RegisterSuccessEvent> {

    @Override
    public void onApplicationEvent(RegisterSuccessEvent registerSuccessEvent) {
        System.out.println("监听到用户注册成功，发送邮件...");
    }
}