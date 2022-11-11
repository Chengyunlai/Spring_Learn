package spring_02_06_13_basic.basic_09.complexInject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class PersonAnnotation {
    @Value("#{new String[]{'王一','王二'}}")
    private String[] names;
    // @Value("#{{'19511','123456'}")
    private List<String> tels;
    @Value("#{{@xiaomiao}}")
    private Set<Cat> cats;
    @Value("#{{'喵咪':@xiaomiao}}")
    private Map<String, Object> events;
    @Value("#{{'userNames':'chengyunlai'}}")
    private Properties props;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }

    public void setEvents(Map<String, Object> events) {
        this.events = events;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "PersonXml{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", props=" + props +
                '}';
    }
}
