package com.stackroute.domain;

import java.sql.SQLOutput;

public class Actor {
    String  name;
    String gender;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print()
    {
        System.out.println("hello java");
        System.out.println("My first spring task");
        System.out.println("Name is "+ name +"\n"+ "Gender is " + gender + "\n"+ " Age is " +age);
    }
}
