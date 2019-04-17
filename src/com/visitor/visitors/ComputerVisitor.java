package com.visitor.visitors;

import com.visitor.elements.*;

/*
ComputerVisitor is the main visitor interface.
It contains methods for visiting each peripheral type.
 */

public interface ComputerVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
    public void visit(Laptop laptop);
    public void visit(Trackpad trackpad);
    public void visit(Microphone microphone);
    public void visit(Webcam webcam);
}
