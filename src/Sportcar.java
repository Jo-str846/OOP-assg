class SportsCar extends Vehicle implements Automobile {
    public SportsCar(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void accelerate() { System.out.println("Sports car launches 0-60 in 3 seconds!"); }

    @Override
    public void stop() { System.out.println("Sports car uses carbon-ceramic brakes."); }

    @Override
    public void gas() { System.out.println("Sports car uses high-octane racing fuel."); }

    @Override
    public void openTrunk() { System.out.println("Minimal storage space opened."); }

    @Override
    public void setSeatbelt(boolean fastened) { System.out.println("Racing harness secured."); }
}