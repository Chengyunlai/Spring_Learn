package top.chengyunlai.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.chengyunlai.bean.User;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {
    List<User> findAll();

    List<User> findAllLazy();

    List<User>findAllByDepartmentId(String departmentId);
}
