package spring_02_06_12_basic.basic_08.bean;

/**
 * @ClassName
 * @Description XML的有参构造
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Person {
    private String name;
    private Integer age;


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
