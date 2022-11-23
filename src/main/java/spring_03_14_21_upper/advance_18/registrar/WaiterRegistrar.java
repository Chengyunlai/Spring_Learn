package spring_03_14_21_upper.advance_18.registrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import spring_03_14_21_upper.advance_18.bean.Waiter;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class WaiterRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        // registerBeanDefinition 方法 第一个参数是 Bean 的名称（id），第二个参数中传入的 RootBeanDefinition 要指定 Bean 的字节码（ .class ）
        registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
    }
}
