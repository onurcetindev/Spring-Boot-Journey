package com.example.autowired.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());

        Manager manager = (Manager) applicationContext.getBean("manager");
        System.out.println(manager.toString());
    }
}

