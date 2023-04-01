package lazy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

/**
 * ProjectName: spring_annotation_study
 * Package: lazy.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 01:46
 * @since JDK 1.8
 */
@Configuration
public class LazyConfig {
    // @Lazy 只針對 singleton
    // 應用啟動時會建立，在取用時才會建立
    @Bean
    @Lazy
    public String hello(){
        System.out.println("hello 被建立了");
        return "hello";
    }

}
