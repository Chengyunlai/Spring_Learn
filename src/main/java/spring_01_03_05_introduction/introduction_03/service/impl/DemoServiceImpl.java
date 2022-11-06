package spring_01_03_05_introduction.introduction_03.service.impl;

import spring_01_03_05_introduction.introduction_03.dao.DemoDao;
import spring_01_03_05_introduction.introduction_03.dao.impl.DemoDaoImpl;
import spring_01_03_05_introduction.introduction_03.factor.BeanFactory;
import spring_01_03_05_introduction.introduction_03.service.DemoService;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DemoServiceImpl implements DemoService {

    // private DemoDao demoDao = new DemoDaoImpl();

    // 不再手动new，而是去factory里拿对象【这里解决底层代码变动时，Service里的代码不用动】
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
