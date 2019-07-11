package com.stackroute.domain;

public class Actor {
    String  name;
    String gender;
    int age;

    //constructor with two parameters
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //function to print the details of actor
    public void print()
    {
        System.out.println("Name is "+ name +"\n"+ "Gender is " + gender + "\n"+ "Age is " +age);
    }
}
