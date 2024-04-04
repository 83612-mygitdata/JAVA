package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	Scanner sc=new Scanner(System.in);
	public Point2D()
	{
		
	}
	
	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void acceptPoint()
	{
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
	}
	public void displayPoint()
	{
		System.out.println("("+x+","+y+")");
	}
	
	public String getDetails()
	{
		return "("+x+","+y+")";
	}
	public boolean isEqual(Point2D p)
	{
		if(this.x==p.x && this.y==p.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public double distance(Point2D p)
	{
		return Math.sqrt(Math.pow(p.x - this.x,2)+Math.pow(p.y- this.y,2));
	}
	

	

}