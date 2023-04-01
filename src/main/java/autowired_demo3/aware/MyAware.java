package autowired_demo3.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * ProjectName: spring_annotation_study
 * Package: autowired_demo3.aware
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 07:05
 * @since JDK 1.8
 */
@Component
public class MyAware implements ApplicationContextAware,
        BeanNameAware, EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("IoC: " + applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Beans: " + name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        // 解析 ${}、#{} 佔位符
        String s = resolver.resolveStringValue("你好${os.name} 我是#{20 +18}");
        System.out.println(s);
    }
}
