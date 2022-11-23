package spring_03_14_21_upper.advance_17.annotation;


import org.springframework.context.annotation.Import;
import spring_03_14_21_upper.advance_17.bean.Boss;
import spring_03_14_21_upper.advance_17.config.BartenderConfiguration;
import spring_03_14_21_upper.advance_17.importSelector.BarImportSelector;
import spring_03_14_21_upper.advance_17.registrar.WaiterRegistrar;

import java.lang.annotation.*;
// 如果一个注解@B，被@Documented标注，那么被@B修饰的类，生成文档时，会显示@B。如果@B没有被@Documented标准，最终生成的文档中就不会显示@B。
@Documented
// 运行时起效
@Retention(RetentionPolicy.RUNTIME)
// 用于描述类、接口(包括注解类型) 或enum声明
@Target(ElementType.TYPE)
// 如果标注了 @EnableTavern 注解，就会触发 @Import 的效果，向容器中导入一个 Boss 类型的 Bean 。
// @Import(Boss.class)

// 它可以导入【配置类】、【ImportSelector 的实现类】，【ImportBeanDefinitionRegistrar 的实现类】，或者【普通类】。
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {

}
