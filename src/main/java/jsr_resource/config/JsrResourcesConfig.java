package jsr_resource.config;

import jsr_resource.dao.EmployeeDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ProjectName: spring_annotation_study
 * Package: jsr_resource.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 06:08
 * @since JDK 1.8
 */
@Configuration
@ComponentScan({"jsr_resource"})
public class JsrResourcesConfig {

    @Bean
    public EmployeeDao employeeDao2(){
        return new EmployeeDao();
    }

}
