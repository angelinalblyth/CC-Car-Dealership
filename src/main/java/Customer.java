import java.util.ArrayList;

public class Customer implements IBuy, ISell{

    private String name;
    private int budget;
    private ArrayList<Vehicle> customerVehicles = new ArrayList<Vehicle>();

    public Customer(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public int getVehiclesBought() {
        return customerVehicles.size();
    }

    public void buy(Vehicle vehicle){
        if(vehicle.getSellPrice() <= budget){
            customerVehicles.add(vehicle);
            budget -= vehicle.getSellPrice();
        }
    }

    public void sell(Vehicle vehicle){
        if(customerVehicles.contains(vehicle)){
            customerVehicles.remove(vehicle);
            budget += vehicle.getBuyPrice();
        }
    }
}
