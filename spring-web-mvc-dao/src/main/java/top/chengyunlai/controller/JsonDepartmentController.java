package top.chengyunlai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import top.chengyunlai.bean.Department;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Controller
public class JsonDepartmentController {
    @PostMapping("/department/saveJson")
    @ResponseBody
    public void saveJson(@RequestBody Department department) {
        System.out.println(department);
    }
}
