public class SystemCheck {
    public static void main(String[] args) {

        Peripheral lenovoLaptop = new Computer();
        lenovoLaptop.accept(new PeripheralChecker());
    }
}
