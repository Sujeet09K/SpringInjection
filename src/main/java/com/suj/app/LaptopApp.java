package com.suj.app;

import com.suj.components.ComponentCreator;
import com.suj.interfaces.IChild;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopApp {
    public static void main(String[] args) {
        //Create application context that will serve create object
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentCreator.class);

        IChild child;
        child = (IChild) applicationContext.getBean("childClass1");
//        child = (IChild) applicationContext.getBean("cc1");
        child.printMessage();
    }
}
