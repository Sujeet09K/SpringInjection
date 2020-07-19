package com.suj.app;

import com.suj.interfaces.ILaptop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.Properties;

public class LaptopApp {
    public static final Logger log = LoggerFactory.getLogger(LaptopApp.class);
    public static void main(String[] args) throws IOException {
        //Create application context using Configuration Class that will serve create object
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentCreator.class);
        //Create application context using XML that will serve create object
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/appContext.xml");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String beanName = bufferedReader.readLine();

        ILaptop laptop;
        laptop = (ILaptop) applicationContext.getBean(beanName);
        laptop.getLaptop();
        laptop.getMonitor().getMonitor();
        System.exit(0);

    }

}
