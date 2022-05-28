package ExpectionAssignment;

import java.util.Scanner;
public class divTwoNumbers {

	public static void main(String[] args) {
		try
		{
			
			float a,b;
			
			Scanner number=new Scanner(System.in);
			
			
			System.out.print("Enter first number : ");
			a=number.nextFloat();
       
			System.out.print("Enter second number : ");
			b=number.nextFloat();
       
			
			double result=a/b;
			
			System.out.println("Result:"+ result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		finally {
			
		}
		System.out.println("The End...");

	}

}
