package methodoverride;

public class OverrideTest {

	public static void main(String[] args) {
		// Creating vehicle object
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.accelarate(80);
		vehicle.stop();
		
		// Creating Car object.
		Car car = new Car();
		car.start();
		car.accelarate(100);
		car.stop();
	}

}
