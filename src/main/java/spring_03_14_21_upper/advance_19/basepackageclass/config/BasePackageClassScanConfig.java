package spring_03_14_21_upper.advance_19.basepackageclass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import spring_03_14_21_upper.advance_19.basepackageclass.component.DemoComponent;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackageClasses = DemoComponent.class)
public class BasePackageClassScanConfig {
}
