package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Pen;

/**
 * @ClassName
 * @Description 使用场景：监听器的引用释放回调。由于 ApplicationContext 中会注册一些 ApplicationListener ，
 * 而这些 ApplicationListener 与 ApplicationContext 互相引用，
 * 所以在 IOC 容器销毁之前，就需要将这些引用断开，这样才可以进行对象的销毁和回收。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class DestructionPenPostProcessor implements DestructionAwareBeanPostProcessor {

    // 比PreDestroy还要先执行
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (bean instanceof Pen) {
            System.out.println("DestructionPenPostProcessor postProcessBeforeDestruction run ......");
            Pen pen = (Pen) bean;
            pen.setInk(0);
        }
    }
}
