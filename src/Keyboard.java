public class Keyboard {

    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
