package spring_02_06_12_basic.basic_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_12_basic.basic_10.aware.ApplicationContextAwareBean;
import spring_02_06_12_basic.basic_10.config.AwareConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ApplicationAware {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfig.class);
        ApplicationContextAwareBean bean = ctx.getBean(ApplicationContextAwareBean.class);
        bean.printBeanNames();
        System.out.println("++");
        System.out.println(bean.getBeanName()); //获取本身容器中的name
    }
}
