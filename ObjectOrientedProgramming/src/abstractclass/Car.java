package abstractclass;

public class Car extends Vehicle {

	public Car(String type, String model) {
		super(type, model);
	}

	@Override
	public int getMaxSpeed() {
		final int MAX_CAR_SPEED = 320;
		System.out.println("Max speed of the " + type + " is : " + MAX_CAR_SPEED);
		return MAX_CAR_SPEED;
	}
	
	@Override
	public void start() {
		System.out.println("Vehicle has started.");
	}
	
	@Override
	public void stop() {
		System.out.println("Vehicle has stopped.");
	}

}
