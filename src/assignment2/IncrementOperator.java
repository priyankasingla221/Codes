package assignment2;

public class IncrementOperator {
	

    public static void main(String[] args) {       
        int x = 1;       
        x = x++ + ++x + x++ + ++x + ++x;       
        System.out.println("Value of x : " + x);
        
    	boolean   y = (x % 2 == 0 );
		
		System.out.println("Value x is Even  " +y);

    }


}
