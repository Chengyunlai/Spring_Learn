package top.chengyunlai.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import top.chengyunlai.bean.User;
import top.chengyunlai.config.ApplicationConfig;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class UserMapperTest{
    @Autowired
    UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void findAllLazy() {
        List<User> allLazy = userMapper.findAllLazy();
        for (User user : allLazy) {
            System.out.println(user);
        }
    }
}