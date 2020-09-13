package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for (int i=1;i<=5;i++)
			
		{
			fact = i * fact;
		}
		
		System.out.println("Factorial of :" +num +" is " +fact);
	
	}


}
