public class Car extends Vehicle {

    private int doors;

    public Car(String make, String model, String colour, int buyPrice, int sellPrice, int year, int mileage, Engine engine, Tyre tyre,int rentalCost, int doors) {
        super(make, model, colour, buyPrice, sellPrice, year, mileage, engine, tyre, rentalCost);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}



