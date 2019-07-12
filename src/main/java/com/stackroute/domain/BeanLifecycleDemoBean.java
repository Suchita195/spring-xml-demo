package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("This is destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties Set Method");
    }

    public void customInit()
    {
        System.out.println("init method called");
    }

    public void customDestroy()
    {
        System.out.println("destroy method called");
    }
}
