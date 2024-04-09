import java.util.Scanner;

public class BaseSalCom_Employee extends Comm_Employee
{
	private double base_salary;
	
	

	public BaseSalCom_Employee() {
		super();
	}

	public BaseSalCom_Employee(double gross_sales, double comm_rate,double base_salary) {
		super(gross_sales, comm_rate);
		this.setBase_salary(base_salary);
	}
	
	public void accept(Scanner sc)
	{
		super.accept(sc);
		System.out.println("Enter the base salary of the Employee:");
		base_salary=sc.nextDouble();
	}

	@Override
	public double calcSal() {
		
		return comm_rate * gross_sales + base_salary;
	}
	
	

	@Override
	public String toString() {
		return "BaseSalCom_Employee [base_salary=" + base_salary + ", gross_sales=" + gross_sales + ", comm_rate="
				+ comm_rate + ", calcSal()=" + calcSal() + ", getBase_salary()=" + getBase_salary()  + ", getGross_sales()=" + getGross_sales() + ", getComm_rate()=" + getComm_rate()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSsn()=" + getSsn()
				+  "]";
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}
	
	public void bonus()
	{
		double salary;
		salary = comm_rate * gross_sales + base_salary + base_salary * 0.1;
		System.out.println("Total salary with bonus is:"+salary);
	}

}
