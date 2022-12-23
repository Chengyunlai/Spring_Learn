package top.chengyunlai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.chengyunlai.bean.User;
import top.chengyunlai.service.DepartmentService;
import top.chengyunlai.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/list")
    public String list(ModelMap map) {
        map.put("userList", userService.findAllUsers());
        return "/userList";
    }

    @GetMapping("/edit")
    public String edit(HttpServletRequest request, String id) {
        request.setAttribute("user", userService.findById(id));
        // 注意这个地方还要选择部门，要把所有的部门查出来
        request.setAttribute("depts", departmentService.findDepartments(null));
        return "/userInfo";
    }

    @PostMapping("/save")
    public String  save(HttpServletRequest request, HttpServletResponse response, User user,@RequestParam("file") MultipartFile multipartFile) throws IOException {
        System.out.println(user);
        System.out.println(multipartFile);
        // 获取原始文件名
        String originalFilename = multipartFile.getOriginalFilename();
        // 获取文件扩展名
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."));

        // 图片保存至本地
        // String filename = UUID.randomUUID().toString() + ext;
        // File file = new File("E:/temp/" + filename);
        // photoFile.transferTo(file);

        user.setPhotoFile(multipartFile.getBytes());
        // 保存到数据库
        userService.update(user);
        return "redirect:/user/list";
    }

    @PostMapping("/batchDelete")
    @ResponseBody
    public String batchDelete(@RequestParam("ids[]") String[] ids) {
        System.out.println(Arrays.toString(ids));
        return "success";
    }

    // 上传
    @PostMapping("/getPhotos")
    public void getPhoto(String id,MultipartFile multipartFile) throws IOException {
        System.out.println(multipartFile);
        // 获取原始文件名
        String originalFilename = multipartFile.getOriginalFilename();
        // 获取文件扩展名
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."));

        // 图片保存至本地
        // String filename = UUID.randomUUID().toString() + ext;
        // File file = new File("E:/temp/" + filename);
        // photoFile.transferTo(file);
        User user = userService.findById(id);
        System.out.println(user);
        user.setPhotoFile(multipartFile.getBytes());
        byte[] photoFile = user.getPhotoFile();

        System.out.println(user);
        // 保存到数据库
        userService.update(user);
    }

    // 下载
    @GetMapping("/getPhoto")
    public ResponseEntity<byte[]> getPhoto(String id) throws UnsupportedEncodingException {
        User user = userService.findById(id);
        // byte[] photo = user.getPhoto();

        // 构建请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", URLEncoder.encode(user.getUsername() + ".jpg", "utf-8"));
        byte[] photo = null;
        return new ResponseEntity<>(photo, headers, HttpStatus.CREATED);
    }
}