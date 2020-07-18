package com.suj.beans.processors;

import com.suj.interfaces.IChild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DualCore implements IChild {
    @Autowired
    DualCore childclass1;

    public void printMessage() {
        System.out.println("printMessage : ChildClass1"+childclass1.getClass());
    }
}
