package spring_05_39_introduction.aop.dao.impl;

import spring_05_39_introduction.aop.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        // 此处应该是访问数据库的操作，用临时数据代替
        // return Arrays.asList("aaa", "bbb", "ccc");

        // 模拟修改SQL的动作
        return Arrays.asList("oracle", "oracle", "oracle");
    }


}
