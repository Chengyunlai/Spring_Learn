package spring_03_14_21_upper.advance_16.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class JueJin {
    private Integer kuangShi = 0;

    public JueJin() {
        // System.out.println("点击签到");
        // System.out.println("签到成功：奖励100矿石");
        this.kuangShi += 100;
        // System.out.println("点击去抽奖");
        this.IsBug();
    }

    public void IsBug(){
        // System.out.println("恭喜你抽中一个Bug");
        // throw new RuntimeException("这是一个真Bug");
    }
}
