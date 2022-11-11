package spring_02_06_13_basic.basic_09.complexInject;


import java.util.*;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PersonXml {
    private String[] names;
    private List<String> tels;
    private Set<Cat> cats;
    private Map<String, Object> events;
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