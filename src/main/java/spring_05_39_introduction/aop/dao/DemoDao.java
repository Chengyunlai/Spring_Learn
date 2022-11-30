package spring_05_39_introduction.aop.dao;

import java.util.List;

public interface DemoDao {
    // 简单定义一个 `DemoDao` 接口，并声明一个 `findAll` 方法模拟从数据库查询一组数据
    List<String> findAll();


}
