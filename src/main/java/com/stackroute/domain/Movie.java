package com.stackroute.domain;

public class Movie {
    Actor actor1;
    Actor actor2;
    Actor actor3;

    //constructor
    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }


    public void display()
    {
        actor1.print();
        actor2.print();
        actor3.print();
    }
}
