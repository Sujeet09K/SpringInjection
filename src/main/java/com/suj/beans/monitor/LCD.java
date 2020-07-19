package com.suj.beans.monitor;

import com.suj.interfaces.IMonitor;
import com.suj.interfaces.IProcessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.suj.app.LaptopApp.log;

@Component
public class LCD implements IMonitor {

    @Autowired
    IProcessors processors;

    public void getMonitor() {
        processors.getProcessor();
        log.info("getMonitor : {}", this.getClass().getCanonicalName());
    }
}
