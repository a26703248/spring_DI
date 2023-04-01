package conditional.config;

import conditional.condition.LinuxCondition;
import conditional.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * ProjectName: spring_annotation_study
 * Package: conditional.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 01:51
 * @since JDK 1.8
 */
@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional({LinuxCondition.class, WindowsCondition.class})
    public String helloA(){
        return "helloA";
    }

    @Bean
    public String helloB(){
        return "helloB";
    }

}
