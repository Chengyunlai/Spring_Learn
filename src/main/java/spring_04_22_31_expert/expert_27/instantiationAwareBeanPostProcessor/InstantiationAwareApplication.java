package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Ball;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Cat;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Person;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.config.InstantiationProcessorConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class InstantiationAwareApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(InstantiationProcessorConfig.class);
        Ball ball2 = (Ball) ctx.getBean("ball2");
        Ball ball = (Ball) ctx.getBean("ball");
        System.out.println(ball);
        System.out.println(ball2);
        Cat cat = (Cat) ctx.getBean("cat");
        Person bean = ctx.getBean(Person.class);
        System.out.println("==");
        System.out.println(bean);
        System.out.println(cat);
        ctx.close();
    }
}
