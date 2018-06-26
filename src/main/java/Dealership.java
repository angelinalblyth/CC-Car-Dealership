import java.util.ArrayList;

public class Dealership implements IBuy, ISell {

    public String name;
    public int till;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Dealership(String name) {
        this.name = name;
        this.till = 10000;

    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public int getVehiclesSize() {
        return vehicles.size();
    }

    public void buy(Vehicle vehicle){
        if(vehicle.getBuyPrice() <= till){
            vehicles.add(vehicle);
            till -= vehicle.getBuyPrice();
        }
    }

    public void sell(Vehicle vehicle){
        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            till += vehicle.getSellPrice();
        }
    }


}
