package com.suj.beans.brand;

import com.suj.interfaces.ILaptop;
import com.suj.interfaces.IMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.suj.app.LaptopApp.log;

@Component
public class Mac implements ILaptop {
    @Autowired
    @Qualifier(value = "LED")
    IMonitor monitor;

    public void getLaptop() {
        log.info("getProcessor : {}", this.getClass().getCanonicalName());
    }
    public IMonitor getMonitor() {
        return monitor;
    }
}
