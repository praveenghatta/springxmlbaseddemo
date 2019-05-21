package com.spring.xmlbaseddemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedDemo {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car myCar = context.getBean("vwCar", Car.class);
        System.out.print(myCar.drive());
        System.out.print(myCar.reverse());
        context.close();
    }
}
