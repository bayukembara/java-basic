package OOP.SuperThis;

public class SuperThisTest {
    public static void main(String[] args) {
        Car car = new Car("Car","Ferarri",300,true);
        System.out.println("Type: " + car.getType());
        System.out.println("Model: " + car.getModel());
        System.out.println("Max Speed: " + car.getMaxSpeed());
        System.out.println("Is Car Automatic ? " + car.isAutomatic());
    }
}
