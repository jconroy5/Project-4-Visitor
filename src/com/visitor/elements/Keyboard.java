package com.visitor.elements;

import com.visitor.visitors.*;

public class Keyboard implements Peripheral{

    @Override
    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
