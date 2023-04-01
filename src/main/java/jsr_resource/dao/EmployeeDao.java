package jsr_resource.dao;

import org.springframework.stereotype.Repository;

/**
 * ProjectName: spring_annotation_study
 * Package: jsr_resource.dao
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 06:07
 * @since JDK 1.8
 */
@Repository
public class EmployeeDao {
    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
