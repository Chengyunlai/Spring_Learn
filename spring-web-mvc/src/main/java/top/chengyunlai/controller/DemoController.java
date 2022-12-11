package top.chengyunlai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Controller
public class DemoController {
    @RequestMapping("/demo")
    public String demo() {
        // 方法的返回值是 String 代表要跳转的页面，返回值就是页面的相对路径（无需加 .jsp 的后缀）
        return "demo";
    }
}
