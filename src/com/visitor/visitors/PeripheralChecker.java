package com.visitor.visitors;

import com.visitor.elements.*;

/*
PeripheralChecker is the implementor of ComputerVisitor.
The visit methods for each peripheral print the status of that peripheral to the console.
 */

public class PeripheralChecker implements ComputerVisitor{

    @Override
    public void visit(Computer computer){
        System.out.println("Checking system... \nComputer is operating normally!\n");
    }

    @Override
    public void visit(Keyboard keyboard){
        System.out.println("Checking keyboard... \nKeyboard is inputting normally!\n");
    }

    @Override
    public void visit(Mouse mouse){
        System.out.println("Checking mouse... \nMouse is inputting normally!\n");
    }

    @Override
    public void visit(Monitor monitor){
        System.out.println("Checking monitor... \nMonitor is displaying normally!\n");
    }

    @Override
    public void visit(Laptop laptop){
        System.out.println("Checking laptop system... \nLaptop is operating normally!\n");
    }

    @Override
    public void visit(Trackpad trackpad){
        System.out.println("Checking trackpad... \nTrackpad is inputting normally!\n");
    }

    @Override
    public void visit(Microphone microphone){
        System.out.println("Checking microphone... \nMicrophone is recording audio normally!\n");
    }

    @Override
    public void visit(Webcam webcam){
        System.out.println("Checking webcam... \nWebcam is outputting video normally!\n");
    }
}
