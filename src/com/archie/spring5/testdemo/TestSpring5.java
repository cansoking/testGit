package com.archie.spring5.testdemo;

import com.archie.spring5.Book;
import com.archie.spring5.Orders;
import com.archie.spring5.User;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("order", Orders.class);
        System.out.println(orders);
        orders.testOrders();
    }
}
