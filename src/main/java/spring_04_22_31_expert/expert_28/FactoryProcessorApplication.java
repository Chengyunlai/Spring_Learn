package spring_04_22_31_expert.expert_28;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_04_22_31_expert.expert_28.bean.Cat;
import spring_04_22_31_expert.expert_28.bean.Dog;
import spring_04_22_31_expert.expert_28.bean.Red;
import spring_04_22_31_expert.expert_28.config.BeanFactoryPostProcessorConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class FactoryProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
        Red red = ctx.getBean(Red.class);
        System.out.println(red);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
