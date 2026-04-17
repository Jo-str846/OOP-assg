class Bus extends Vehicle {
    public Bus(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Bus slowly builds momentum.");
    }

    @Override
    public void stop() {
        System.out.println("Bus uses air brakes to stop.");
    }

    @Override
    public void gas() {
        System.out.println("Bus runs on diesel fuel.");
    }
}