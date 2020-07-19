package com.suj.beans.brand;

import com.suj.interfaces.ILaptop;
import com.suj.interfaces.IMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import static com.suj.app.LaptopApp.log;

@Component
@Service(value = "dellLaptop")
public class Dell implements ILaptop {
    //Mapping of monitor object
    @Autowired
    //Default value of monitor
//    @Qualifier (value = "LCD")
    @Resource(name = "${laptop.monitor}")
    IMonitor monitor;

    //Returns the monitor
    public IMonitor getMonitor() {
        return monitor;
    }

    public void getLaptop() {
        log.info("getProcessor : {}", this.getClass().getCanonicalName());
    }

    @PostConstruct
    public void postConstruct (){
        log.info("Creating the bean", this.getClass().getCanonicalName());
    }

    @PreDestroy
    public void preDestroy (){
        log.info("Destroying the bean", this.getClass().getCanonicalName());
    }
}
