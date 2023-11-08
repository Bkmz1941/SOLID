package SOLID.O.GoodCodeDesign;

public class Guitar {
    private final String make;
    private final String model;
    private final int volume;


    public Guitar(String model, String make, int volume) {
        this.model = model;
        this.make = make;
        this.volume = volume;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }
}
