package juejin.assemblyModules.anno;

import juejin.assemblyModules.beanDefinition.ImportBeanDefinitionRegistrarImpl;
import juejin.assemblyModules.config.AssemblyConfig;
import juejin.assemblyModules.importSelector.ImportSelectorImpl;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({ AssemblyConfig.class, ImportBeanDefinitionRegistrarImpl.class, ImportSelectorImpl.class})
public @interface EnableAnimal {
}
