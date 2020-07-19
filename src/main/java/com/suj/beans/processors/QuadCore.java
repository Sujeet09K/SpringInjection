package com.suj.beans.processors;

import com.suj.interfaces.IProcessors;

import static com.suj.app.LaptopApp.log;

public class QuadCore implements IProcessors {
    public void getProcessor() {
        log.info("getProcessor : {}", this.getClass().getCanonicalName());
    }
}
