package spring_02_06_13_basic.basic_09.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class DaoImpl {

    Person person;

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }
}
