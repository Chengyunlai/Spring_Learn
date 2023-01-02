package top.chengyunlai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import top.chengyunlai.bean.Department;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
@Mapper
public interface DepartmentMapper {
    void save(Department department);

    List<Department> findAll();
}
