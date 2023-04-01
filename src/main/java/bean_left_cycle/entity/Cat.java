package bean_left_cycle.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_left_cycle.entity
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:43
 * @since JDK 1.8
 */
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("cat constructor ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("InitializingBean: cat destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DisposableBean: car after properties set ...");
    }
}
