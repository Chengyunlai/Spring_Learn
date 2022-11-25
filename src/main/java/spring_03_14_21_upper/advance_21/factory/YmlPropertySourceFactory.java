package spring_03_14_21_upper.advance_21.factory;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class YmlPropertySourceFactory implements PropertySourceFactory {

    //在 snake-yaml 中有一个能快速解析 yml 文件的类，叫 YamlPropertiesFactoryBean ，它可以快速加载 Resource 并转为 Properties
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource) throws IOException {
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        // 传入resource资源文件
        yamlPropertiesFactoryBean.setResources(encodedResource.getResource());
        // 直接解析获得Properties对象
        Properties properties = yamlPropertiesFactoryBean.getObject();
        // 如果@PropertySource没有指定name，则使用资源文件的文件名
        return new PropertiesPropertySource((name != null ? name : encodedResource.getResource().getFilename()), properties);
    }
}
