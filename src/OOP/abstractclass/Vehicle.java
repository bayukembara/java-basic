package OOP.abstractclass;

public abstract class Vehicle {
    String type,model;

//    Constructor
    public Vehicle (String type,String model){
        this.type = type;
        this.model = model;
    }

//    non abstract methods
    public void start(){
        System.out.println("Vehicle has started.");
    }

    public void stop(){
        System.out.println("vehicle has stopped.");
    }

//    abstract class
    public abstract int getMaxSpeed();
}
