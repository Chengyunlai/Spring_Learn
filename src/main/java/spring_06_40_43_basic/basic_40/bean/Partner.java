package spring_06_40_43_basic.basic_40.bean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Partner {
    private String name;

    public Partner(String name) {
        this.name = name;
    }

    /**
     * 收钱
     * @param money
     */
    public void receiveMoney(int money) {
        System.out.println(name + "收到佣金：" + money + "元 ~ ");
    }

    /**
     * 陪玩
     * @param player
     */
    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起愉快地玩耍 ~ ");
    }
}
