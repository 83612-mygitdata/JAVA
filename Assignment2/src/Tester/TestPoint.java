package Tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPoint {
	
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x1 : ");
		x1=sc.nextInt();
		System.out.println("y1 : ");
		y1=sc.nextInt();
		System.out.println("x2 : ");
		x2=sc.nextInt();
		System.out.println("y2 : ");
		y2=sc.nextInt();
		
		Point2D p1=new Point2D(x1,y1);
		System.out.println("p1:"+p1.getDetails());
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p2:"+p2.getDetails());
		
		if(p1.isEqual(x2, y2)==true)
		{
			System.out.println("Coordinate that you have provided are pointing to the same point.");
			
		}
		else
		{
			p1.distance(x2,y2);
		}
	}

}
