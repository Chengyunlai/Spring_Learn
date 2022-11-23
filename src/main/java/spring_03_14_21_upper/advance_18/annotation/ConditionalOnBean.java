package spring_03_14_21_upper.advance_18.annotation;

import org.springframework.context.annotation.Conditional;
import spring_03_14_21_upper.advance_18.utils.OnBeanCondition;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {
    // 传入的是全类名
    String[] beanNames() default {};

    // 传入的是类型
    Class<?>[] value() default {};
}
