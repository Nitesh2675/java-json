package com.bridgelabzPractice;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    public String brand;
    public int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class JsonCar {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper=new ObjectMapper();
        Car car=new Car("ALto",2009);
        String jsonString=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
        System.out.println(jsonString);
    }
}
