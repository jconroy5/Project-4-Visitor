public class SystemCheck {
    public static void main(String[] args) {

        Peripheral dellComputer = new Computer();
        System.out.println("*****Initiating Computer System Check*****\n");
        dellComputer.accept(new PeripheralChecker());

        Peripheral lenovoLaptop = new Laptop();
        System.out.println("*****Initiating Laptop System Check*****\n");
        lenovoLaptop.accept(new PeripheralChecker());
    }
}
