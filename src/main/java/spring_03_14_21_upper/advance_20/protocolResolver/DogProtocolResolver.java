package spring_03_14_21_upper.advance_20.protocolResolver;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DogProtocolResolver implements ProtocolResolver {
    public static final String DOG_PATH_PREFIX = "dog:";

    @Override
    public Resource resolve(String s, ResourceLoader resourceLoader) {
        if (!s.startsWith(DOG_PATH_PREFIX)) {
            return null;
        }
        // 把自定义前缀去掉
        String realpath = s.substring(DOG_PATH_PREFIX.length());
        String classpathLocation = "classpath:advance/" + realpath;
        return resourceLoader.getResource(classpathLocation);
    }
}
