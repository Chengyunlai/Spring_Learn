package spring_02_06_13_basic.basic_11.bean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/

public abstract class Toy {
    private String name;

    public Toy(String name) {
        System.out.println("生产了一个" + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }

    public Toy() {
    }
}

