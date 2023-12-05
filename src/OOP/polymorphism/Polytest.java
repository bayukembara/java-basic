package OOP.polymorphism;

public class Polytest {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
//        ? This is working because car is subclass of vehicle
        vehicle.accelerate();

        Vehicle vehicle1 = new Motorcycle();
        vehicle1.accelerate();
    }
}
