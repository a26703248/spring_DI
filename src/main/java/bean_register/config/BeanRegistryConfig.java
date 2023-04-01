package bean_register.config;

import bean_register.registry.MyImportBeanDefinitionRegistry;
import import_anno.entity.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_register.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:58
 * @since JDK 1.8
 */
@Configuration
@Import({MyImportBeanDefinitionRegistry.class})
public class BeanRegistryConfig {

    @Bean
    public Color color(){
        return new Color();
    }

}
