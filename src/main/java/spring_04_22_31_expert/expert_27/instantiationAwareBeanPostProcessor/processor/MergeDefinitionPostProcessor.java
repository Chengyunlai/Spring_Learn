package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.processor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Cat;

/**
 * @ClassName
 * @Description postProcessMergedBeanDefinition 方法发生在 bean 的实例化之后，自动注入之前。而这个设计，就是为了在属性赋值和自动注入之前，把要注入的属性都收集好，这样才能顺利的向下执行注入的逻辑。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class MergeDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    // 先创建的 Cat, 后打印的后置处理器执行
    // 为什么只有 beanDefinition 和 beanType ？难道 bean 还没有创建吗？
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String s) {
        if (Cat.class.equals(beanType)) {
            System.out.println("MergeDefinitionPostProcessor postProcessMergedBeanDefinition run......");
            System.out.println(beanDefinition);
        }
    }


}
