package com.app.geometry;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	
	public String getDetails()
	{
		return "("+x+","+y+")";
	}
	public boolean isEqual(int x,int y)
	{
		if(this.x==x && this.y==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void distance(int x,int y)
	{
		double a = Math.pow((x-this.x),2);
		double b = Math.pow((y-this.y),2);
		double d = Math.sqrt(a+b);
		System.out.println("Distance between given two points is : "+d);
	}
	

	

}
