package OOP.intefaces;

public class Motorcycle implements Drivable {
    @Override
    public void turnLeft() {
        System.out.println("Motorcycle can turn Left");
    }

    @Override
    public void turnRight() {
        System.out.println("Motorcycle can turn Right");
    }

}
