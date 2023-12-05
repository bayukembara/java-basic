package OOP.encapsulation;

public class EncapsulationTest {
	public static void main(String[] args) {
		Car car = new Car("Lamborghini",320,true);
		System.out.println("Model: " + car.getModel());
		System.out.println("MaxSpeed: " + car.getMaxSpeed());
		System.out.println("isAutomatic: " + car.isAutomatic());
	}
}
