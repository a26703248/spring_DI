package autowired_demo.service;

import autowired_demo.entity.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * ProjectName: spring_annotation_study
 * Package: autowired_demo.service
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 05:16
 * @since JDK 1.8
 */
@Service
public class BookService {
    /*
    @Autowired
    1. 預設會在容器中尋找相同類別的物件
    2. 若有多個相同類別的物件
     */
    @Autowired(required = false) // 容器中有物件就裝配上沒有則不裝配
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
