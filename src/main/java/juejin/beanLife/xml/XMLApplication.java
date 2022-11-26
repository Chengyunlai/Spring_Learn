package juejin.beanLife.xml;

import juejin.beanLife.xml.bean.Person;
import juejin.beanLife.xml.config.BeanLifeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class XMLApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanLifeConfig.class);
        // 被Spring管理的Bean会和容器一块加载，所以当容器加载时，初始化方法自动执行，这时候我们拿出对应的Bean看其Hp
        Person bean = ctx.getBean(Person.class);
        System.out.println(bean.getHp());
        ctx.close();
    }
}
