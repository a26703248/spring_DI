package bean_left_cycle.bean_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_left_cycle.bean_proccessor
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:56
 * @since JDK 1.8
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    /*
        AbstractAutowireCapableBeanFactory
            $applyBeanPostProcessorsBeforeInitialization // 初始化前呼叫 processor
            $invokeAwareMethods                          // 初始化 Bean
            $applyBeanPostProcessorsAfterInitialization  //  初始化後呼叫 processor

     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor: " + beanName + " init before ....");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor: " + beanName + " init after ...");
        return bean;
    }
}
