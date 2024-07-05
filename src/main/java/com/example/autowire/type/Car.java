package com.example.autowire.type;

public class Car {
    private Specification specification;
    // xml dosyasında byName olarak tanımladığımız name buradaki attribute ile aynı olmalıdır.

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details : " +specification.toString());
    }
}
