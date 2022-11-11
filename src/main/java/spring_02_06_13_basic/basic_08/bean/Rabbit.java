package spring_02_06_13_basic.basic_08.bean;

/**
 * @ClassName
 * @Description 配置类的构造器注入
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Rabbit {
    private String name;
    private Integer age;

    public Rabbit(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
