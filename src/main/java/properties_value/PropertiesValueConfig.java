package properties_value;

import import_anno.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ProjectName: spring_annotation_study
 * Package: properties_value
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 04:57
 * @since JDK 1.8
 */
@PropertySource({"classpath:/application.properties"})
@Configuration
public class PropertiesValueConfig {

    @Bean
    public Dog dog(){
        return new Dog();
    }

}
