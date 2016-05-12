package FreeCodeCamp;

public class BabySteps {

	public static void main(String args[])
	{
		
		float sum=0;
			for(String s: args)
			{
				sum=sum +Float.parseFloat(s);
			}
			System.out.println("Sum is"+sum);
		
	}
}
