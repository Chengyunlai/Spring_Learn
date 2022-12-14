package top.chengyunlai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Controller
@RequestMapping("/juejin")
public class Juejin {
    // 请求转发
    @GetMapping("/list")
    public void toList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/juejin/error").forward(request,response);
    }

    @GetMapping("/error")
    @ResponseBody
    public String to404(HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        return "你好";
    }

    @GetMapping("/list2")
    public void toList2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/juejin/error");
    }
}
