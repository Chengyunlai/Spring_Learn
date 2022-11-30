package juejin.eventListener;

import juejin.eventListener.service.Up;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class EventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("juejin.eventListener");
        Up up = ctx.getBean(Up.class);
        up.publishVideo();
    }
}
