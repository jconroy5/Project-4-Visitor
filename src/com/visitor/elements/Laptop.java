package com.visitor.elements;

import com.visitor.visitors.*;

/*
Laptop is an implementor of Peripheral.
It can have multiple Peripherals, held in the laptopPeripherals array.
When a Laptop is visited, the status of the laptop itself, and the status of its Peripherals, is reported.
 */

public class Laptop implements Peripheral{

    //Initiating the laptopPeripherals array
    Peripheral[] laptopPeripherals;

    //Adding a Keyboard, Trackpad, Webcam, and Microphone to the array
    public Laptop(){
        laptopPeripherals = new Peripheral[] {new Keyboard(), new Trackpad(), new Webcam(), new Microphone()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor){

        computerVisitor.visit(this);

        //Accepting the ComputerVisitor on each Peripheral in the array
        for(int i = 0; i < laptopPeripherals.length; i++){
            laptopPeripherals[i].accept(computerVisitor);
        }
    }
}
