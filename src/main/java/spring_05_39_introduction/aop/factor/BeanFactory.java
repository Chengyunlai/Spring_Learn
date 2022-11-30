package spring_05_39_introduction.aop.factor;

import spring_05_39_introduction.aop.dao.DemoDao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanFactory {
    // 使用IO的方式读取外部文件，解决耦合问题
    private static Properties properties;

    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();


    // 使用静态代码块初始化properties，加载factord.properties文件
    static {
        properties = new Properties();
        try {
            // 必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("aop_introduction/factory.properties"));
        } catch (IOException e) {
            // BeanFactory类的静态初始化都失败了，那后续也没有必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static DemoDao getDemoDao(String beanName) {
        // return new DemoDaoImpl(); // 紧耦合的关系，若DemoDaoImpl.java不存在导致编译失败

        // 解决紧耦合 ：反射可以声明一个类的全限定名，来获取它的字节码描述，这样也能构造对象！

        try {
            // return (DemoDao) Class.forName("spring_01_03_05_introduction.introduction_03.dao.impl.DemoDaoImpl").newInstance();
            return (DemoDao) Class.forName(properties.getProperty(beanName)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        // 双检锁保证beanMap中确实没有beanName对应的对象
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    // 过了双检锁，证明确实没有，可以执行反射创建
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        // 反射创建后放入缓存再返回
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] DataSource!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}
