package spring_06_40_43_basic.basic_40_cglib;

import spring_06_40_43_basic.basic_40.bean.Player;
import spring_06_40_43_basic.basic_40_cglib.bean.Partner;
import spring_06_40_43_basic.basic_40_cglib.bean.PartnerPlatform;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        Player player = new Player("郝武辽");
        // Partner partner = new Partner("肖洁洁");
        Partner partner = PartnerPlatform.getPartner(50);
        // partner.receiveMoney(51);
        partner.playWith(player);
    }
}
