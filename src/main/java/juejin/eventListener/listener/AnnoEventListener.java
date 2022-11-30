package juejin.eventListener.listener;

import juejin.eventListener.event.NewVideoEvent;
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
public class AnnoEventListener {
    @EventListener
    public void ListenNewVideoEvent(NewVideoEvent event){
        System.out.println("你关注的UP主更新视频啦");
    }
}
