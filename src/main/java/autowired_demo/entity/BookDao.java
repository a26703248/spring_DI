package autowired_demo.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * ProjectName: spring_annotation_study
 * Package: autowired_demo.entity
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 05:19
 * @since JDK 1.8
 */
@Repository
public class BookDao {

    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
