package spring_06_40_43_basic.basic_40.inter.impl;

import spring_06_40_43_basic.basic_40.bean.Player;
import spring_06_40_43_basic.basic_40.inter.Partner;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class IndividualPartner implements Partner {
    private String name;

    public IndividualPartner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void receiveMoney(int money) {
        System.out.println(name + "收到佣金：" + money + "元 ~ ");
    }

    @Override
    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起愉快地玩耍 ~ ");
    }
}
