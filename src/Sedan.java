class Sedan extends Vehicle implements Automobile {
    public Sedan(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Sedan accelerates smoothly.");
    }

    public void accelerate(int speed) {
        System.out.println("Sedan accelerates to " + speed + " mph.");
    }

    @Override
    public void stop() { System.out.println("Sedan stops at the light."); }

    @Override
    public void gas() { System.out.println("Sedan uses regular unleaded."); }

    @Override
    public void openTrunk() { System.out.println("Sedan trunk is open."); }

    @Override
    public void setSeatbelt(boolean fastened) {
        System.out.println("Seatbelt fastened: " + fastened);
    }
}