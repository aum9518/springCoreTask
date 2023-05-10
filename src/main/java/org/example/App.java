package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cinema cinema = context.getBean("cinema", Cinema.class);
        System.out.println(cinema);
        Cinema cinema1 = context.getBean("cinemaSet", Cinema.class);
        System.out.println(cinema1);

    }
}
