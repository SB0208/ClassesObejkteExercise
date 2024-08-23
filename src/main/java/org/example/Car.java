package org.example;

public class Car {

 public String brand;
 public String model;
 public String color;
 public int year;
 public int speed;



 public Car(String brand, String model, String color, int year, int speed) {
     this.brand = brand;
     this.model = model;
     this.color = color;
     this.year = year;
     this.speed = speed;






 }

    public void start() {
        System.out.println("Starting Car");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
    }

    public void accelerate(){

        this.speed += 3;



    }




}
