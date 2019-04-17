package com.visitor.elements;

import com.visitor.visitors.*;

public class Monitor implements Peripheral{

    @Override
    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
