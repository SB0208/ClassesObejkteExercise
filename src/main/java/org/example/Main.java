package org.example;

public class Main {


    public static void main(String[] args) {

        Car one = new Car ("Citroen","Cactus","yellow",2020, 2);
        Person human = new Person("A",20,"female");



      Car[] carList = {one};
      Person[] personList = {human};

      one.start();
      human.introduce();






    }










}