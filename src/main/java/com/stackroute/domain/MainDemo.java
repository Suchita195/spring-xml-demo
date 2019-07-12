package com.stackroute.domain;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

    public static void main(String[] args) {
        //using application context
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beandemo= context.getBean("BeanLifecycleDemoBean",BeanLifecycleDemoBean.class);
        context.close();



    }

}
