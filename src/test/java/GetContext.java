import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:36
 * @since JDK 1.8
 */
public class GetContext {

    public static String[] getBeanNames(Class<?> configClass){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(configClass);
        return context.getBeanDefinitionNames();
    }

}
