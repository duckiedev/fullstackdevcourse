package branching;

public class ContinueStatement {

	public static void main(String[] args) {
		
		// continue skips to the end of the loop and continues it
		// break ends the loop totally
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
