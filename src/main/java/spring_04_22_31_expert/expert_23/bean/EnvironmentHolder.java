package spring_04_22_31_expert.expert_23.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class EnvironmentHolder implements EnvironmentAware {
    Environment environment;

    public void printEnvironment() {
        System.out.println(environment);
        System.out.println(environment.getProperty("jdbc.url"));
        // 它有一个默认值是 default ，它是从哪来的呢？
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;

    }
}
