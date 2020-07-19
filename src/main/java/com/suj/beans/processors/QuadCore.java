package com.suj.beans.processors;

import com.suj.interfaces.IProcessors;
import org.springframework.stereotype.Component;

import static com.suj.app.LaptopApp.log;

@Component
public class QuadCore implements IProcessors {

    public void getProcessor() {
        log.info("getProcessor : {}", this.getClass().getCanonicalName());
    }
}
