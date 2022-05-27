package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		// Creating Car object
		Car car = new Car();
		car.type = "Car";
		car.model = "Ferrari";
		car.maxSpeed = 320;
		car.print();
		
		// Creating Motorcycle object
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.type = "Motorcycle";
		motorcycle.model = "Kawasaki";
		motorcycle.maxSpeed = 180;
		motorcycle.print();
	}

}
