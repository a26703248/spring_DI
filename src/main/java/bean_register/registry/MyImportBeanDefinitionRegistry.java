package bean_register.registry;

import import_selector_ann.entity.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_register.registry
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:58
 * @since JDK 1.8
 */
public class MyImportBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry,
                                        BeanNameGenerator importBeanNameGenerator) {
        /*
         AnnotationMetadata 當前備標註 @Import 註解的物件所有註解
         BeanDefinitionRegistry 註冊 Bean 物件\
         */
        boolean definition = registry.containsBeanDefinition("color");
        if (definition) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
