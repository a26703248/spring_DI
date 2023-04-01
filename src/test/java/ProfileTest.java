import jsr_resource.config.JsrResourcesConfig;
import jsr_resource.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import profile.config.ProfileConfig;

import java.util.Arrays;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 07:42
 * @since JDK 1.8
 */
public class ProfileTest {

    @Test
    public void test01(){
        // 改變執行環境方法
        // 1. 使用命令指定參數
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(ProfileConfig.class);

        // 2. 啟動容器時指定(必須使用無參建構子),可設定多個
        // 建立容器
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        // 設定環境
        context.getEnvironment().setActiveProfiles("test", "default");
        // 註冊設定檔
        context.register(ProfileConfig.class);
        // 更新容器
        context.refresh();

        String[] beans = context.getBeanDefinitionNames();
        Arrays.stream(beans).forEach(System.out::println);
        context.close();
    }


}
