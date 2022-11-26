package juejin.beanLife.xml.bean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Person {
    private String name = null;
    private Integer Hp = 0;

    public void addHp(){
        this.Hp = 100;
    }

    public void reduceHp(){
        this.Hp -= 100;
        System.out.println("Hp被灭啦");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getHp() {
        return Hp;
    }

    public void setHp(Integer hp) {
        Hp = hp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Hp=" + Hp +
                '}';
    }
}
