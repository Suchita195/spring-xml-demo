package com.stackroute.domain;
public class Actor {
    private String  name;
    private String gender;
    private int age;

    //constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //function to print the details of actor
    public void print()
    {
        System.out.println("Name is "+ name +"\n"+ "Gender is " + gender + "\n"+ "Age is " +age);
    }
}
