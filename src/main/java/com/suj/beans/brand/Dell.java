package com.suj.beans.brand;

import com.suj.interfaces.ILaptop;
import com.suj.interfaces.IMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.suj.app.LaptopApp.log;

@Component
public class Dell implements ILaptop {
    //Mapping of monitor object
    @Autowired
    //Default value of monitor
    @Qualifier (value = "LCD")
    IMonitor monitor;

    //Returns the monitor
    public IMonitor getMonitor() {
        return monitor;
    }

    public void getLaptop() {
        log.info("getProcessor : {}", this.getClass().getCanonicalName());
    }
}
