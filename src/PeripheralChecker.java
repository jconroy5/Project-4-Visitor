public class PeripheralChecker implements ComputerVisitor{

    @Override
    public void visit(Computer computer){
        System.out.println("Checking system... \nComputer is operating normally!");
    }

    @Override
    public void visit(Keyboard keyboard){
        System.out.println("Checking keyboard... \nKeyboard is inputting normally!");
    }

    @Override
    public void visit(Mouse mouse){
        System.out.println("Checking mouse... \nMouse is inputting normally!");
    }

    @Override
    public void visit(Monitor monitor){
        System.out.println("Checking monitor... \nMonitor is displaying normally!");
    }
}
