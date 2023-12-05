package OOP.methodoverride;

public class OverrideTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        v.accelerate(10);
        v.stop();

        Car car = new Car();
        car.start();
        car.accelerate(100);
        car.stop();
    }
}
