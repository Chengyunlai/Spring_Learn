package spring_03_14_21_upper.advance_16.bean;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class ContextClosedApplicationListener {

    @EventListener
    public void onContextClosedEvent(ContextClosedEvent event) {
        System.out.println("注解的方式监听到ContextClosedEvent事件！");
    }

    @EventListener
    public void onContextClosedEvent(ContextRefreshedEvent event) {
        System.out.println("注解的方式监听到ContextRefreshedEvent事件！");
    }
}
