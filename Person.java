/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author pc
 */
public class Person {

    private String name;
    private int age;
    private String gender;
    private String address;

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public Person(String name, int age) {
        this(name, age, "Not specified", "Not specified");
    }
    public Person(String name) {
        this(name, 0, "Not specified", "Not specified");
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address);
    }
    public void displayInfo(boolean showNameOnly) {
        if (showNameOnly) {
            System.out.println("Name: " + name);
        } else {
            displayInfo();
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("Ayan", 30, "Male", "123 Main St");
        Person person2 = new Person("Bushra", 25);
        Person person3 = new Person("Farhan");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo(true); 
    }
}
