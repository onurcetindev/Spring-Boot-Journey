package com.example.autowired.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Qualifier("employee")
    private  Employee employee;
    /* birden fazla Employee bean'i tanımlandıysa ve Spring hangi bean'i
     inject edeceğini bilemiyorsa, @Qualifier belirli bir bean'i seçmek için kullanılır
     */

    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
