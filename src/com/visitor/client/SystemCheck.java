package com.visitor.client;

import com.visitor.elements.*;
import com.visitor.visitors.*;

/*
SystemCheck is the client. Run it to execute the main method.
The client creates a Computer called dellComputer, and a Laptop called lenovoLaptop.
Each object accepts the PeripheralChecker, which visits each peripheral/component of the device based on it's type.
After visiting a peripheral, the status of the peripheral is printed to the console.
 */

public class SystemCheck {
    public static void main(String[] args) {

        //Creating example Computer dellComputer
        Peripheral dellComputer = new Computer();
        System.out.println("*****Initiating Computer System Check*****\n");

        //Executing PeripheralChecker
        dellComputer.accept(new PeripheralChecker());

        //Creating example Laptop lenovoLaptop
        Peripheral lenovoLaptop = new Laptop();
        System.out.println("*****Initiating Laptop System Check*****\n");

        //Executing PeripheralChecker
        lenovoLaptop.accept(new PeripheralChecker());
    }
}
