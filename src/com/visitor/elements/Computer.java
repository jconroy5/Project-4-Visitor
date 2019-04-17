package com.visitor.elements;

import com.visitor.visitors.*;

/*
Computer is an implementor of Peripheral.
It can have multiple Peripherals, held in the computerPeripherals array.
When a Computer is visited, the status of the computer itself, and the status of its Peripherals, is reported.
 */

public class Computer implements Peripheral{

    //Initiating computerPeripherals array
    Peripheral[] computerPeripherals;

    //Adding a Keyboard, Mouse, and Monitor to the array
    public Computer(){
        computerPeripherals = new Peripheral[] {new Keyboard(), new Mouse(), new Monitor()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor){

        computerVisitor.visit(this);

        //Accepting the ComputerVisitor on each Peripheral in the array
        for(int i = 0; i < computerPeripherals.length; i++){
            computerPeripherals[i].accept(computerVisitor);
        }
    }
}
