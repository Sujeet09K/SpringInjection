package com.suj.components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Acts as configuration class
@Configuration
//Search in below package for beans
//When used this, all the beans need not to be mentioned in this class
@ComponentScan("com.suj.beans")
public class ComponentCreator {
    /*@Bean ({"childclass1","cc1"})
    @Scope("prototype")
    public IChild getChildClass1 (){
        System.out.println("Returning Child class 1");
        return new ChildClass1();
    }*/
}
