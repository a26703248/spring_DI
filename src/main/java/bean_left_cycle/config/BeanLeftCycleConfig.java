package bean_left_cycle.config;

import bean_left_cycle.entity.AirPlant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_leftcycle.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:30
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("bean_left_cycle")
public class BeanLeftCycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AirPlant airPlant(){
        return new AirPlant();
    }

}
