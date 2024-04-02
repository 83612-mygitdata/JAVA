/*
 * Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods
 */

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value:");
		
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
			System.out.println("Enter second value:");
			if(sc.hasNextDouble())
			{
				num2=sc.nextDouble();
				avg=(num1+num2)/2;
				System.out.println("Average of the numbers is:"+avg);
			}
			else
			{
				System.out.println("Data types should be double only..");
			}
		}

	}

}
