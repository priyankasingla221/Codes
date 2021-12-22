package assignment2;

public class IncrementDemo {
	public static void main(String[] args) {

		int a = 1;
		int b = 0;

		System.out.println(a++);

		System.out.println(a++);
		System.out.println(++a);

		System.out.println(a++);
		System.out.println(a++);

		System.out.println(a--);
		System.out.println(a--);

		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a--);

		boolean isGreater = (a > b);

		System.out.println("Value of a is Greater than 0 : " + isGreater);

	}

}
