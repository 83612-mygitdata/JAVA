import java.util.Scanner;

public class Salaried_Employee extends Employee
{
	private double weekly_sal;
	
	Salaried_Employee()
	{
		
	}

	public Salaried_Employee(double weekly_sal) {
		super();
		this.weekly_sal = weekly_sal;
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter the weekly salary of the Employee:");
		weekly_sal=sc.nextDouble();
	}
	
	
	
	@Override
	public String toString() {
		return "Salaried_Employee [weekly_sal=" + weekly_sal + ", calcSal()=" + calcSal() +  ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSsn()=" + getSsn() + ", getClass()=" + getClass() + "]";
	}

	public double calcSal()
	{
		return 20000.0;
	}

}
