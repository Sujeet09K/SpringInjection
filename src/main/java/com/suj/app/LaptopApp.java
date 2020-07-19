package com.suj.app;

import com.suj.components.ComponentCreator;
import com.suj.interfaces.ILaptop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp {
    public static final Logger log = LoggerFactory.getLogger(LaptopApp.class);
    public static void main(String[] args) {
        //Create application context using Configuration Class that will serve create object
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentCreator.class);
        //Create application context using XML that will serve create object
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/appConfig.xml");

        ILaptop laptop;
        laptop = (ILaptop) applicationContext.getBean("dell");
        laptop.getLaptop();
        laptop.getMonitor().getMonitor();

    }
}
