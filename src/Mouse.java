public class Mouse {

    public void acccept(ComputerVisitor computerVisitor){
        computerVisitor.visit(this);
    }
}
