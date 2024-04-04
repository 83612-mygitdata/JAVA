package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of points to plot:");
		int choice;
		Point2D[] points=new Point2D[sc.nextInt()];
		
		
		for(int i=0;i<points.length;i++)
		{
			
			points[i]=new Point2D();
			points[i].acceptPoint();
		}
		
		do
		{
			System.out.println("1. Display details of specific point");
			System.out.println("2. Display x-y coordinates of all points");
			System.out.println("3. User i/p : 2 indices for the points , validate the indices");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			System.out.println("****************************");
			
			switch(choice)
			{
			case 1:
				int index;
				System.out.println("Enter the index you want the point of:");
				index=sc.nextInt();
				for(int i=0;i<points.length;i++)
				{
					if(points[i]==points[index])
					{
						System.out.println("The specified point is:");
						points[index].displayPoint();
					}
				}
				break;
				
			case 2:
				for(int i=0;i<points.length;i++)
				{
					points[i].displayPoint();
				}
				break;
				
			case 3:
			{
				int start_ind,end_ind;
				System.out.print("Enter Starting point : ");
				start_ind = sc.nextInt();
				if(start_ind>=0 && start_ind<points.length)
				{
					System.out.print("Enter End point : ");
					end_ind = sc.nextInt();
					
					if(end_ind>=0 && end_ind<points.length)
					{
					 
					 if(points[start_ind].isEqual(points[end_ind]))
						{
							System.out.println("coordinate you provides are pointing to a same point");
						}
						else
						{
							System.out.println("Starting point and Ending point are at different position");
							double distance = points[start_ind].distance(points[end_ind]);
							System.out.println("Distance between Start point and End point = " + distance);
						}
					}
					else
					{
						System.out.println("Invalid Index ");
					}
					 
				}
				else
				{
					System.out.println("Invalid Index ");
				}
			}
			break;
			
			case 4:
				System.out.println("Thank you!");
				break;
			}
		}while(choice!=0);
	}
}
