package org.springframework.debug.tx.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.debug.tx.annotation.config.TransactionConfig;
import org.springframework.debug.tx.annotation.dao.BookDao;

public class TransactionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TransactionConfig.class);
        applicationContext.refresh();
//        BookService bean = applicationContext.getBean(BookService.class);
//        bean.checkout("zhangsan",1);
        BookDao bean = applicationContext.getBean(BookDao.class);
        bean.test();
    }
}
