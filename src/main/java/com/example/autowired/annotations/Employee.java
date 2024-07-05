package com.example.autowired.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")  // isim tanımlamak zorunlu değil ancak tanıımlayacaksan da xml dosyasındaki ile aynı olmalı
public class Employee {
    @Value("2")
    private int employeeId;
    @Value("Onur")
    private String name;
    @Value("Çetin")
    private String lastName;
    @Value("2000.0")            // Value ile değer atayabiliyoruz eğer atamazsak default değerler çıktıda gözükür
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
