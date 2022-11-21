package spring_03_14_21_upper.advance_14.listableBeanFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import spring_03_14_21_upper.advance_14.listableBeanFactory.bean.Dog;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ListableBeanFactoryApplication {
    public static void main(String[] args) throws Exception {
        ClassPathResource resource = new ClassPathResource("advance/listableBeanFactory.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        // 直接打印容器中的所有Bean
        System.out.println("加载xml文件后容器中的Bean：");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);

        // 手动注册一个单实例Bean
        beanFactory.registerSingleton("doggg", new Dog());
        // 再打印容器中的所有Bean
        System.out.println("手动注册单实例Bean后容器中的所有Bean：");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("容器中真的有注册Dog：" + beanFactory.getBean("doggg"));
        // 通过getBeanNamesOfType查找Dog
        System.out.println("容器中的所有Dog：" + Arrays.toString(beanFactory.getBeanNamesForType(Dog.class)));
    }
}
