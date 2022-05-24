package staticexample;

public class Car {
	
	public static int currentSpeed = 0;
	public static int maxSpeed = 180;
	
/*
	public static void showCurrentSpeed(int speed) {
		System.out.println("Your current speed is : " + speed);
	} */
	
	// rewrote simpler and less verbose. no need to pass though currentSpeed if its primary purpose is to always show currentSpeed...
	public static void showCurrentSpeed() {
		System.out.println("Your current speed is : " + currentSpeed);
	}
	
/*
	public static void speedUp(int increase) {
		currentSpeed += increase;
		if (currentSpeed > maxSpeed) {
			showCurrentSpeed(currentSpeed);
			System.out.println("Please slow down!");
		}
		else
		{
			showCurrentSpeed(currentSpeed);
		}
	} */
	
	// rewrote much simpler on my own
	public static void speedUp(int increase) {
		currentSpeed += increase;
		showCurrentSpeed();
		if (currentSpeed > maxSpeed) {
			System.out.println("Please slow down!");
		}
	}
	
	public static void speedDown(int decrease) {
		currentSpeed -= decrease;
		showCurrentSpeed();
	}
	
	public static void stop() {
		currentSpeed = 0;
		showCurrentSpeed();
	}

}
