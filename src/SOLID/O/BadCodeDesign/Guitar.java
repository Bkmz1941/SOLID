package SOLID.O.BadCodeDesign;

public class Guitar {
    private final String make;
    private final String model;
    private final int volume;

    // After a few months, we decide the Guitar is a little boring
    // and could use a cool flame pattern to make it look more rock and roll
    private final String flameColor;

    public Guitar(String model, String make, int volume, String flameColor) {
        this.model = model;
        this.make = make;
        this.volume = volume;
        this.flameColor = flameColor;
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

    public String getFlameColor() {
        return flameColor;
    }
}
