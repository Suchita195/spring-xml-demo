package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.security.cert.X509Certificate;

public class MainDemo {

    public static void main(String[] args) {
        //using application context
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= context.getBean("movie",Movie.class);
        movie.display();

        Movie movie1= context.getBean("movie",Movie.class);
        movie1.display();

        //using bean factory
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie2=factory.getBean("movie",Movie.class);
        movie2.display();


    }

}
