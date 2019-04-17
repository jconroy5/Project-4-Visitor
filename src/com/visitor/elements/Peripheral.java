package com.visitor.elements;

import com.visitor.visitors.*;

public interface Peripheral {
    public void accept(ComputerVisitor computerVisitor);
}
