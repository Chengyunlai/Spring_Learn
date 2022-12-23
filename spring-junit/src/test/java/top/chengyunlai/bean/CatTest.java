package top.chengyunlai.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import top.chengyunlai.config.JunitConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = JunitConfig.class,loader = AnnotationConfigContextLoader.class)
public class CatTest {
    @Autowired
    Cat cat;

    @Test
    public void testToString() {
        System.out.println(cat);
    }
}