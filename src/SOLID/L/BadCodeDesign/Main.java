package SOLID.L.BadCodeDesign;

import SOLID.L.BadCodeDesign.Cars.Car;
import SOLID.L.BadCodeDesign.Cars.ElectricCar;
import SOLID.L.BadCodeDesign.Cars.MotorCar;

public class Main {
    public static void main(String[] args) {
        try {
            testCar(new MotorCar());
            testCar(new ElectricCar());
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }

    private static void testCar(Car car) {
        try {
            car.turnOnEngine();
            car.accelerate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
