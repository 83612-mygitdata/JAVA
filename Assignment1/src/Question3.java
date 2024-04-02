/*
Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food deatils. Only display the total of orderd
food)
 */

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int amt=0;
		int order=0;
		int choice;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("****FOOD MENU****");
			System.out.println("0. Generate Bill");
			System.out.println("1. Dosa");
			System.out.println("2. Idli");
			System.out.println("3. Pav Bhaji");
			System.out.println("4. Pani puri");
			System.out.println("Enter your choice..");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Generate Bill");
				break;
				
			case 1:
				System.out.println("Purchased Dosa");
				amt += 50;
				order++;
				break;
				
			case 2:
				System.out.println("Purchased Idli");
				amt += 30;
				order++;
				break;
				
			case 3:
				System.out.println("Purchased Pav Bhaji");
				amt += 60;
				order++;
				break;
				
			case 4:
				System.out.println("Purchased Pani Puri");
				amt += 20;
				order++;
				break;
				
			default:
				System.out.println("Not available!");
				
			}
		}while(choice!=0);
		
		System.out.println("Total orders = "+order);
		System.out.println("Total amount = "+amt);
	}

}
