package conditional.condition;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * ProjectName: spring_annotation_study
 * Package: conditional.condition
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:21
 * @since JDK 1.8
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // ConditionContext 上下文
        // AnnotatedTypeMetadata 註解物件

        // 取的 IoC 中的 BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // 取得 classLoader
        ClassLoader classLoader = context.getClassLoader();

        // 取得執行環境資訊及環境變數
        Environment env = context.getEnvironment();

        // 定義Bean物件
        BeanDefinitionRegistry registry = context.getRegistry();

        return env.getProperty("os.name")
                .toLowerCase()
                .contains("linux");
    }
}
