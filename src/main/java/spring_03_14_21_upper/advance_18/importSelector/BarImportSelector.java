package spring_03_14_21_upper.advance_18.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import spring_03_14_21_upper.advance_18.bean.Bar;
import spring_03_14_21_upper.advance_18.config.BarConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BarImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{BarConfiguration.class.getName()};
    }
}
