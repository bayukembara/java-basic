package OOP.encapsulation;

public class Car extends Vehicle{

    private boolean isAutomatic = false;
    public Car(String model, int maxSpeed,boolean isAutomatic) {
        super(model, maxSpeed);
        this.isAutomatic = isAutomatic;
    }
}
