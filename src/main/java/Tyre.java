public class Tyre implements IRepair {

    private String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String repair(Vehicle vehicle){
        return "Inflated tyres on " + vehicle.getMake();
    }
}
