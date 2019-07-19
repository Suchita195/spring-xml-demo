package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;

public class MainDemo {

    public static void main(String[] args) {
        //using application context
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1= context.getBean("movie1",Movie.class);
        movie1.display();

        Movie movie2= context.getBean("movie2",Movie.class);
        movie2.display();

        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.display();

        //checking for the equality
        System.out.println(movie2==movie3);

    }

}
