package spring_02_06_12_basic.basic_12.bean.instanceFactory;

import org.springframework.stereotype.Component;
import spring_02_06_12_basic.basic_12.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class InstanceFactory {
    public Person getPerson(){
        return new Person();
    }
}
