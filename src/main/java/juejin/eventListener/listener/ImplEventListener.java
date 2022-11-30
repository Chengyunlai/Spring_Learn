package juejin.eventListener.listener;

import juejin.eventListener.event.NewVideoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class ImplEventListener implements ApplicationListener<NewVideoEvent> {
    @Override
    public void onApplicationEvent(NewVideoEvent event) {
        System.out.println("你关注的UP更新视频啦");
    }
}
