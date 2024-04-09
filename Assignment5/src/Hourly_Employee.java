import java.util.Scanner;

public class Hourly_Employee extends Employee
{
	private double hourly_wage;
	private int hours_worked;
	
	
	public Hourly_Employee() {
		super();
		
	}

	public Hourly_Employee(double hourly_wage, int hours_worked) {
		super();
		this.hourly_wage = hourly_wage;
		this.hours_worked = hours_worked;
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter the hourly salary of the Employee:");
		hourly_wage = sc.nextDouble();
		System.out.println("Enter the number of hours worked by an Employee:");
		hours_worked = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Hourly_Employee [hourly_wage=" + hourly_wage + ", hours_worked=" + hours_worked + ", calcSal()="
				+ calcSal()  + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSsn()=" + getSsn() +"]";
	}

	@Override
	public double calcSal() {
		if(hours_worked<=40)
		{
			return hourly_wage * hours_worked;
		}
		else
		{
			double total;
			total = (hourly_wage * hours_worked + (40-hours_worked)*hourly_wage*1.5);
			return total;
		}
	}

}
