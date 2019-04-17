package com.visitor.elements;

import com.visitor.visitors.*;

public class Laptop implements Peripheral{
    Peripheral[] computerPeripherals;

    public Laptop(){
        computerPeripherals = new Peripheral[] {new Keyboard(), new Trackpad(), new Webcam(), new Microphone()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor){

        computerVisitor.visit(this);

        for(int i = 0; i < computerPeripherals.length; i++){
            computerPeripherals[i].accept(computerVisitor);
        }
    }
}
