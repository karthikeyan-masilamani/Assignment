public class Armstrong {

	public static void main(String[] args) {
		int input =153;
		int intial=153;
		int finalvalue=0;
				
		while(input >0)
		{
		int num =input%10; 
		int arms= num*num*num; 
		finalvalue =arms+finalvalue; 
		input = input/10;
		}

		System.out.println("Armstrong value of input: " +intial+ " is " +finalvalue);
		
		if(finalvalue ==intial)
		{
			System.out.println("Given number is Armstrong number");
		}
		
		else
		{
			System.out.println("Given number is not Armstrong number");
		}
		
	}

}
