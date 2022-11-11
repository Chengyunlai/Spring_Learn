package spring_02_06_12_basic.basic_12.bean.staticFactory;

import org.springframework.stereotype.Component;
import spring_02_06_12_basic.basic_12.bean.StaticCat;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/

public class StaticFactory {
    public static StaticCat getCar() {
        return new StaticCat();
    }
}
