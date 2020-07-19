package com.suj.beans.monitor;

import com.suj.interfaces.IMonitor;
import com.suj.interfaces.IProcessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.suj.app.LaptopApp.log;

@Component
@PropertySource("classpath:config/appConfig.properties")
public class LED implements IMonitor {
    @Autowired
//    @Qualifier(value = "quadCore")
    @Resource(name = "${laptop.processor}")
    IProcessors processors;

    public void getMonitor() {
        processors.getProcessor();
        log.info("getMonitor : {}", this.getClass().getCanonicalName());
    }
}
