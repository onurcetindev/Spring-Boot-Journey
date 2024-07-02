package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Loaded the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        //Provided to Spring
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
