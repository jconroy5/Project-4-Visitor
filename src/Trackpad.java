public class Trackpad implements Peripheral {

    @Override
    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
