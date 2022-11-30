package juejin.eventListener.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class NewVideoEvent extends ApplicationEvent {
    public NewVideoEvent(Object source) {
        super(source);
    }
}
