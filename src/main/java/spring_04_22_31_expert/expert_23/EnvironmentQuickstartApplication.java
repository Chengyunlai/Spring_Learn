package spring_04_22_31_expert.expert_23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_04_22_31_expert.expert_23.bean.EnvironmentHolder;
import spring_04_22_31_expert.expert_23.config.EnvironmentPropertyConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class EnvironmentQuickstartApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                EnvironmentPropertyConfiguration.class);
        EnvironmentHolder environmentHolder = ctx.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }
}
