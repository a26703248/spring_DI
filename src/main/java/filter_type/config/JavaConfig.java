package filter_type.config;

import filter_type.filter.MyTypeFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * ProjectName: spring_annotation_study
 * Package: TypeFilter_demo.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 12:58
 * @since JDK 1.8
 */
@Configuration
@ComponentScan(value = "filter_type", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {
                Controller.class
        })}, includeFilters = {
//        @ComponentScan.Filter({
//                Service.class,
//        }),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {
            MyTypeFilter.class
        })
}, useDefaultFilters = false)
public class JavaConfig {
    /*
    includeFilters
    必須加上 useDefaultFilters = false，因為預設全包含
    Filter Type:
        ANNOTATION: 註解型態(default)
        ASSIGNABLE_TYPE: 物件類型
        ASPECTJ: aspectj 表達式
        REGEX: 正則表達式
        CUSTOM: 自訂
     */

    @Bean
    public String hello(){
        return "hello";
    }

}
