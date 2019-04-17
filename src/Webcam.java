public class Webcam implements Peripheral {

    @Override
    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
