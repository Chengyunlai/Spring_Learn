package spring_04_22_31_expert.expert_29;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_04_22_31_expert.expert_29.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ProgrammaticQuickstartApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // 没有配置类，我们可以通过向容器中加载 BeanDefinition
        // 介绍 BeanDefinition 的结构时，我们就知道属性变量值的封装是在一组 PropertyValues 中，so 在这里，我们构造 BeanDefinition 时，就可以顺便把属性值也设置好
        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).addPropertyValue("name", "zhangsan").getBeanDefinition();;
        ctx.registerBeanDefinition("person", personDefinition);

        // 如果没有预先传入配置文件 / 配置类 / 包扫描路径，则必须手动调用 refresh() 方法来初始化 ApplicationContext
        ctx.refresh();
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
