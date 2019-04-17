public class Monitor {

    public void accept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
