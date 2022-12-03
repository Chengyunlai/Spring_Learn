package spring_06_40_43_basic.basic_40;

import spring_06_40_43_basic.basic_40.bean.PartnerPlatform;
import spring_06_40_43_basic.basic_40.bean.Player;
import spring_06_40_43_basic.basic_40.inter.Partner;

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
        partner.receiveMoney(51);
        partner.playWith(player);
    }
}
