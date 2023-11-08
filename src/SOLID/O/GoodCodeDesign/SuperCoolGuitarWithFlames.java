package SOLID.O.GoodCodeDesign;

public class SuperCoolGuitarWithFlames extends Guitar {
    private final String flameColor;

    public SuperCoolGuitarWithFlames(String model, String make, int volume, String flameColor) {
        super(model, make, volume);

        this.flameColor = flameColor;
    }

    public String getFlameColor() {
        return flameColor;
    }
}
