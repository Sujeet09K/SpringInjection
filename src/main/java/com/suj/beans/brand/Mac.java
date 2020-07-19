package com.suj.beans.brand;

import com.suj.interfaces.ILaptop;
import com.suj.interfaces.IMonitor;

public class Mac implements ILaptop {
    IMonitor monitor;
    public void getLaptop() {
        System.out.println("printMessage : ChildClass2");
    }
    public IMonitor getMonitor() {
        return monitor;
    }
}
