package OOP.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
//        ? Creating Car
        Car c = new Car();
        c.type = "Car";
        c.model = "BMW";
        c.maxSpeed = 200;
        c.print();

//        ? Creating Motorcycle
        Motorcycle m = new Motorcycle();
        m.type = "Motorcycle";
        m.model = "Honda";
        m.maxSpeed = 120;
        m.print();
    }
}
