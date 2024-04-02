/*
 * Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
 */

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int num = sc.nextInt();
		
		String b= Integer.toBinaryString(num);
		System.out.println("Binary Number is :"+b);
		
		String o= Integer.toOctalString(num);
		System.out.println("Octal Number is :"+o);
		
		String hd= Integer.toHexString(num);
		System.out.println("Hexadecimal Number is :"+hd);

	}

}
