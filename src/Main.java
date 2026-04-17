public class Main {
    public static void main(String[] args) {
        Sedan myCar = new Sedan("Toyota", 2024);

        System.out.println("--- Demonstration ---");
        myCar.displayInfo();
        myCar.accelerate();
        myCar.accelerate(65);
        myCar.setSeatbelt(true);
        myCar.stop();
    }
}