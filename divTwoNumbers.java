package ExpectionAssignment;

import java.util.*;
public class divTwoNumbers {

	public static void main(String[] args) {
		try
		{
			
			int a,b;
			
			Scanner number=new Scanner(System.in);
			
			
			System.out.print("Enter first number : ");
			a=number.nextInt();
       
			System.out.print("Enter second number : ");
			b=number.nextInt();
       
			
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
