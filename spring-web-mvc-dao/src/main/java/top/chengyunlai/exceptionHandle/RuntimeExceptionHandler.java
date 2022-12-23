package top.chengyunlai.exceptionHandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@ControllerAdvice
public class RuntimeExceptionHandler {
    // 捕捉RuntimeException.class
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String handleRuntimeException(HttpServletRequest request,
                                         HttpServletResponse response, RuntimeException e) {
        e.printStackTrace();
        // 返回 error 就相当于跳转到 error.jsp 页面。
        return "error";
    }
}
