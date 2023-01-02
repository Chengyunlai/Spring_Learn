package juejin.assemblyModules;

import juejin.assemblyModules.config.AssemblyApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AssemblyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AssemblyApplicationConfig.class);
        // ctx.register(AssemblyApplicationConfig.class);
        // ctx.refresh();
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

    }
}
