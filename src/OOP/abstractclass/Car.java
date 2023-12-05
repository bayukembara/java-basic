package OOP.abstractclass;

public class Car extends Vehicle{

    public Car(String type, String model) {
        super(type, model);
    }

    @Override
    public int getMaxSpeed() {
        final int MAX_CAR_SPEED = 300;
        System.out.println("Max Speed of the car: " + MAX_CAR_SPEED);
        return 0;
    }
@Override
    public void start(){
        System.out.println("Vehicle has started.");
    }
@Override
    public void stop(){
        System.out.println("vehicle has stopped.");
    }
}
