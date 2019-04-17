public class Computer implements Peripheral{
    Peripheral[] computerPeripherals;

    public Computer(){
        computerPeripherals = new Peripheral[] {new Keyboard(), new Mouse(), new Monitor()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor){
        for(int i = 0; i < computerPeripherals.length; i++){
            computerPeripherals[i].accept(computerVisitor);
        }
        computerVisitor.visit(this);
    }
}
