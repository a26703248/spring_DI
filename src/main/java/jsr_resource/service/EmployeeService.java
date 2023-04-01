package jsr_resource.service;

import jsr_resource.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * ProjectName: spring_annotation_study
 * Package: jsr_resource.service
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 06:08
 * @since JDK 1.8
 */
@Service
public class EmployeeService {

    /*
    @Resource 與 @Autowired @Inject(JSR330) 相同效果
    1. @Resource(JSR250)、@Inject(JSR330) 都為 JSR 規範
    2. @Resource、@Inject 預設透過變數名稱作為容器內尋找並裝配
    3. @Resource、@Inject 沒有 @Qualifier、@Primary 功能
    4. @Inject 可使用@Primary 功能
    5. @Inject 需引入 javax.inject library
    @Autowired 透過 AutowiredAnnotationBeanPostProcessor 後制器完成裝配
     */
    @Inject
    private EmployeeDao employeeDao;

    public void print(){
        System.out.println(employeeDao);
    }

    @Override
    public String toString() {
        return "EmployeeService{" +
                "employeeDao=" + employeeDao +
                '}';
    }
}
