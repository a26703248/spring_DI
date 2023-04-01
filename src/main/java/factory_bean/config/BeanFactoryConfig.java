package factory_bean.config;

import factory_bean.factory.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ProjectName: spring_annotation_study
 * Package: factory_bean.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:16
 * @since JDK 1.8
 */
@Configuration
public class BeanFactoryConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
