package spring_03_14_21_upper.advance_16.bean.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName
 * @Description 自定义了一个事件。假设为注册成功的事件
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class RegisterSuccessEvent extends ApplicationEvent {

    public RegisterSuccessEvent(Object source) {
        super(source);
    }
}
