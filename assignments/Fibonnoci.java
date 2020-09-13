package week1.day1.assignments;

public class Fibonnoci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3;
		
		//0 1 1 2 3
		
		System.out.print(num1);
		System.out.print(num2);
		
		for (int i=3;i<=8;i++)
		{
			num3=num1+num2;
			
			System.out.print(num3);
			
			num1=num2;
			num2=num3;

	}

}
}
