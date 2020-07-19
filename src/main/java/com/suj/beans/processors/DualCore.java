package com.suj.beans.processors;

import com.suj.interfaces.IProcessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.suj.app.LaptopApp.log;

@Component
public class DualCore implements IProcessors {

    public void getProcessor() {
        log.info("getProcessor : {}", this.getClass().getCanonicalName());
    }
}
