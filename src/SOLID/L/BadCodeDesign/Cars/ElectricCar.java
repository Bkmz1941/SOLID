package SOLID.L.BadCodeDesign.Cars;

public class ElectricCar implements Car {

    // By throwing a car without an engine into the mix, we are inherently changing the behavior of our program
    @Override
    public void turnOnEngine() throws Exception {
        throw new Exception("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("Move forward");
    }
}
