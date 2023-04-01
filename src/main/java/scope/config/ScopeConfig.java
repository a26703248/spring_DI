package scope.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * ProjectName: spring_annotation_study
 * Package: scope.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 01:34
 * @since JDK 1.8
 */
@Configuration
@ComponentScan("scope")
public class ScopeConfig {

    /*
    prototype: 每次使用每次建立
    singleton: 啟動應用時只建立一次(default)
    需再 web 中使用(較少使用)
    request: 一次request請求建立一次
    session: 同一個session建立一次
     */
    @Bean
    @Scope("prototype")
    public String hello(){
        System.out.println("hello 被建立");
        return "hello";
    }
}
