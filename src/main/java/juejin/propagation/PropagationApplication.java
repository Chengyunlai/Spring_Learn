package juejin.propagation;

import juejin.propagation.config.PropagationConfig;
import juejin.propagation.service.OrdersService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PropagationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PropagationConfig.class);
        OrdersService bean = ctx.getBean(OrdersService.class);
        bean.overbooking("掘金背包");
    }
}
