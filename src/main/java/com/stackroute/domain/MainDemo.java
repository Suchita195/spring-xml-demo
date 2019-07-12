package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

    public static void main(String[] args) {
        //using application context
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= context.getBean("movie",Movie.class);
        movie.display();

        Movie movie1= context.getBean("movie1",Movie.class);
        movie1.display();


    }

}
