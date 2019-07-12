package com.stackroute.domain;

public class Movie {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    //empty constructor
    public Movie() {
    }

    //constructor
    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    //setters
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    public void display()
    {
        actor1.print();
        actor2.print();
        actor3.print();
    }
}
