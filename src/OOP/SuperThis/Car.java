package OOP.SuperThis;

public class Car extends Vehicle {

    boolean isAutomatic = false;

    public Car(String type, String model, int maxSpeed, boolean isAutomatic) {
        super(type, model, maxSpeed); //super class constructor calling
        this.isAutomatic = isAutomatic;
    }
    public boolean isAutomatic() {
        return isAutomatic;
    }

}
