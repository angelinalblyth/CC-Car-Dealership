public class Engine implements IRepair{

    private String make;
    private String fuelType;

    public Engine(String make, String fuelType) {
        this.make = make;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String repair(Vehicle vehicle){
        return "Changed oil on " + vehicle.getMake();
    }
}
