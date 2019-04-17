package com.visitor.elements;

import com.visitor.visitors.*;

public class Mouse implements Peripheral{

    @Override
    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
