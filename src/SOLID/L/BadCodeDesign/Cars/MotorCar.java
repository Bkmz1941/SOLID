package SOLID.L.BadCodeDesign.Cars;

public class MotorCar implements Car {
    private String engine;

    @Override
    public void turnOnEngine() {
        System.out.println("Turn on the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Move forward");
    }
}
