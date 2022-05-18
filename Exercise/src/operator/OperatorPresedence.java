package operator;

public class OperatorPresedence {

	public static void main(String[] args) {
		
		// Multiplication before Adding
		int result = 5 + 2 * 4;
		System.out.println("Result : " + result);

		result = (5 + 2) * 4;
		System.out.println("Result : " + result);
	}

}
