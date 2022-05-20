package branching;

public class ReturnStatement {

	public static void main(String[] args) {
		
		boolean bool = true;
		
		System.out.println("Before the return");
		if (bool)
			return;
		System.out.println("This statement will not be executed.");
		
		/*int k = 2;
		switch (k) {
			case 1 :
				System.out.println("1");
				break; // ends the switch statement
			case 2 :
				System.out.println("2");
				return; // exits the current method/function
		}
		System.out.println("Welcome!");*/

	}

}
