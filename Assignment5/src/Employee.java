import java.util.Scanner;

public abstract class Employee 
{
	private String firstName;
	private String lastName;
	private int ssn;
	
	Employee()
	{
		
	}
	Employee(String firstName,String lastName,int ssn)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter the First name - ");
		firstName = sc.next();
		System.out.println("Enter the Last name - ");
		lastName = sc.next();
		System.out.println("Enter the Social security number - ");
		ssn = sc.nextInt();
	}
	
//	public void displayEmployee()
//	{
//		System.out.println("First name : "+firstName);
//		System.out.println("Last name : "+lastName);
//		System.out.println("Social Security Number(SSN) : "+ssn);
//	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	public abstract double calcSal();  //abstract methods don't have body..
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setSsn(int ssn)
	{
		this.ssn = ssn;
	}
	
	public int getSsn()
	{
		return ssn;
	}

}
