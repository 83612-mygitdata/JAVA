package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int size;
		int index=0;
		System.out.println("Enter the size of basket:");
		size=sc.nextInt();
		Fruit Basket[]=new Fruit[size];
		
		
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Add an Mango");
			System.out.println("2. Add a Orange");
			System.out.println("3. Add a Apple");
			System.out.println("4. Display names of all the fruits in the basket");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank you!");
				break;
				
			case 1:
				if(index<size)
				{
					Basket[index]=new Mango();
					Basket[index].accept(sc);
					index++;
				}
				break;
				
			case 2:
				if(index<size)
				{
					Basket[index]=new Orange();
					Basket[index].accept(sc);
					index++;
				}
				break;
				
			case 3:
				if(index<size)
				{
					Basket[index]=new Apple();
					Basket[index].accept(sc);
					index++;
				}
				break;
				
			case 4:
				for (Fruit fruit : Basket) {
					if(fruit != null)
					{
						
						System.out.println(fruit.getName());
					}
					else
					{
						System.out.println("empty!");
					}
				}
				break;
				
			case 5:
				for(Fruit fruit:Basket)
				{
					System.out.println("Fruits in Basket are: "+fruit);
					
				}
				break;
				
			case 6:
				for (Fruit fruit : Basket) {
					if(fruit.isFresh()==false)
					{
						System.out.println("Taste is : "+fruit.taste());
					}
					else
					{
						System.out.println(fruit.getName() + " is fresh");
					}
				}
				break;
				
			case 7:
				int i;
				System.out.println("Enter the index : ");
				i=sc.nextInt();
				if(i<index && i>=0)
				{
					Basket[i].setFresh(false);
					
					System.out.println("The fruit at "+i+"  is stale and the fruit is:"+Basket[i].getName());
					
				}
				break;
				
			case 8:
				for (Fruit fruit : Basket) {
					if(fruit.taste()=="sour")
					{
						fruit.setFresh(false);
						System.out.println("The fruit is stale!");
					}
				}
				break;
					
					
			}
		}while(choice!=0);
		

	}

}
