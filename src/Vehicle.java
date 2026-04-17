abstract class Vehicle {
    protected String Brand;
    protected int year;

    public Vehicle(String Brand, int year) {
        this.Brand = Brand;
        this, year = year;
    }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();

    public void displayInfo() {
        System.out.println("Year: "+ year + "Brand: "+ Brand);
    }
}