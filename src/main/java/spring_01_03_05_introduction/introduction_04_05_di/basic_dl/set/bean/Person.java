package spring_01_03_05_introduction.introduction_04_05_di.basic_dl.set.bean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Person {
    private String name;
    private Integer age;
    // getter and setter ......


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonXml{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
