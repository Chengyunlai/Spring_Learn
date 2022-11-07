package spring_01_03_05_introduction.introduction_04_05_di.basic_dl.set.bean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Cat {
    private String name;
    private Person master;
    // getter and setter ......


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
