public class Microphone implements Peripheral{

    @Override
    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
