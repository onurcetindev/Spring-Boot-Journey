package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("autowireByName.xml");

        Car myCar = (Car) applicationContext.getBean("myCar");
        myCar.displayDetails();
    }
}
