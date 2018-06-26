public class Car extends Vehicle {

    private int doors;

    public Car(String make, String model, String colour, int price, int year, int mileage, Engine engine, Tyre tyre, int doors) {
        super(make, model, colour, price, year, mileage, engine, tyre);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}
