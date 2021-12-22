package assignment2;

public class IncrementOperator {

	public static void main(String[] args) {
		int x = 2;
		x = x++ + ++x + x++ + ++x + ++x;
		System.out.println("Value of x : " + x);
		
		if (x % 2 == 0) {
			System.out.println("Value of x is Even");

		} else {
			System.out.println("Value of x Odd");
		}

		boolean isEven= (x%2==0);
		System.out.println("x value is even ? = " +isEven);
		
		
	}

}
