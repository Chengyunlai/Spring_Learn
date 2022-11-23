package spring_03_14_21_upper.advance_18.utils;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import spring_03_14_21_upper.advance_18.bean.Boss;

/**
 * @ClassName
 * @Description 用来给Conditional添加条件,表示它用来判断 IOC 容器中是否存在 ... 的对象
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ExistBossCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }
}
