package top.chengyunlai.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@ControllerAdvice
public class DataModelAttributeAdvice {
    // 公共数据暴露
    @ModelAttribute("publicMessage")
    public String publicMessage() {
        return "publicMessage-hahaha";
        // 每次 Controller 中的方法执行之前，都执行了一次 request.setAttribute("publicMessage", publicMessage()); 的代码。所以我们在 Controller 的任意位置，都能拿到这个 publicMessage
    }

    @ModelAttribute("username")
    public String processUsername(String username) {
        return username + "haha";
    }
}
