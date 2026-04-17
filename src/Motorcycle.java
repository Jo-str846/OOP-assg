class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle twists the throttle to speed up.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle uses hand and foot brakes.");
    }

    @Override
    public void gas() {
        System.out.println("Motorcycle uses premium gasoline.");
    }
}