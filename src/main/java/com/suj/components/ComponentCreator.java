package com.suj.components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.suj.beans")
public class ComponentCreator {
    /*@Bean ({"childclass1","cc1"})
    @Scope("prototype")
    public IChild getChildClass1 (){
        System.out.println("Returning Child class 1");
        return new ChildClass1();
    }*/
}
