package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		int input =123;
		int intial=123;
		int finalvalue=0;
				
		while(input >0)
		{
		int num =input%10; 
		int arms= num*num*num; 
		finalvalue =arms+finalvalue; 
		input = input/10;
		}

		System.out.println("Armstrong value of input: " +intial+ " is " +finalvalue);
		
	}

}
