package com.visitor.elements;

import com.visitor.visitors.*;

/*
This is the main interface for computer peripherals / components.
The accept method allows a ComputerVisitor (specifically PeripheralChecker) to visit each of the peripherals.
 */

public interface Peripheral {
    public void accept(ComputerVisitor computerVisitor);
}
