import java.util.Scanner;

public class Comm_Employee extends Employee
{
	protected double gross_sales;
	protected double comm_rate;
	
	public Comm_Employee() {
		super();
	}

	public Comm_Employee(double gross_sales, double comm_rate) {
		super();
		this.gross_sales = gross_sales;
		this.comm_rate = comm_rate;
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter the gross sales of the Employee:");
		gross_sales=sc.nextDouble();
		System.out.println("Enter the commission rate of the Employee:");
		comm_rate=sc.nextDouble();
		
	}

	@Override
	public double calcSal() {
		return comm_rate * gross_sales;
	}

	@Override
	public String toString() {
		return "Comm_Employee [gross_sales=" + gross_sales + ", comm_rate=" + comm_rate + ", calcSal()=" + calcSal()
				+ ", getGross_sales()=" + getGross_sales() + ", getComm_rate()=" + getComm_rate()  + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSsn()=" + getSsn() +  "]";
	}

	public double getGross_sales() {
		return gross_sales;
	}

	public void setGross_sales(double gross_sales) {
		this.gross_sales = gross_sales;
	}

	public double getComm_rate() {
		return comm_rate;
	}

	public void setComm_rate(double comm_rate) {
		this.comm_rate = comm_rate;
	}
	
	

}
