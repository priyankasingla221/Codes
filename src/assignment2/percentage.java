package assignment2;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths =75;
		int science = 55;
		int operatingsystem = 80;
		int datawarehouse= 75;
		int total= maths + science+ operatingsystem +datawarehouse;
		double percentage = total*100/400;
		
		
		System.out.println("Marks of subject maths is = " +maths);
		System.out.println("Marks of subject science is = " +science);
		System.out.println("Marks of subject operatingsystem is = " +operatingsystem);
		System.out.println("Marks of subject datawarehouse is = " +datawarehouse);
		 System.out.println("Percentage of all Four subject is = " +percentage);
		

	}

}
