package spring_04_22_31_expert.expert_26.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_04_22_31_expert.expert_26.beanPostProcessor.bean.Cat;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanPostProcessorQuickstartApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("spring_04_22_31_expert.expert_26.beanPostProcessor");
        Cat bean = ctx.getBean(Cat.class);
        System.out.println(bean);
        ctx.close();
    }
}
