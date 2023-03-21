package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Person p1 = ctx.getBean("t1", Person.class);
        Person p2 = ctx.getBean("t2", Person.class);
//        Person p2 = ctx.getBean("t2", Person.class);
        p1.printData();
        p2.printData();

        System.out.println("Hello world!");
    }
}