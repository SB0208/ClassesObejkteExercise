package org.example;

public class Person {

    public String name;
    public int age;
    public String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Name : " + name + " Age : " + age + " Gender : " + gender);
    }
}
