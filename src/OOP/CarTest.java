package OOP;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Koenigsegg");
        car.start();
        car.accelerate();
        car.showSpeed();
        car.stop();
        car.showSpeed();

        Car newCar = new Car("Koenigsegg","Blue Gold Burgandy",2014);
        System.out.println(newCar);
    }
}
