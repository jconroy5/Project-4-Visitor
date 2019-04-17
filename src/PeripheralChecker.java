public class PeripheralChecker implements ComputerVisitor{

    @Override
    public void visit(Computer computer){
        System.out.println("\nChecking system... \nComputer is operating normally!");
    }

    @Override
    public void visit(Keyboard keyboard){
        System.out.println("\nChecking keyboard... \nKeyboard is inputting normally!");
    }

    @Override
    public void visit(Mouse mouse){
        System.out.println("\nChecking mouse... \nMouse is inputting normally!");
    }

    @Override
    public void visit(Monitor monitor){
        System.out.println("\nChecking monitor... \nMonitor is displaying normally!");
    }
}
