public class Vehicle {

    private String make;
    private String model;
    private String colour;
    private int buyPrice;
    private int sellPrice;
    private int year;
    private int mileage;
    private Engine engine;
    private Tyre tyre;

    public Vehicle(String make, String model, String colour, int buyPrice,int sellPrice, int year, int mileage, Engine engine, Tyre tyre) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
