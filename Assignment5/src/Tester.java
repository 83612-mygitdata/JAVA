import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("1. Calculate the salary for Salaried employees.");
		System.out.println("2. Calculate the salary for Hourly salaried employees.");
		System.out.println("3. Calculate the salary for Commissioned employees.");
		System.out.println("4. Calculate the salary for Base salary commissioned employees.");
		System.out.println("5. You have entered wrong choice!");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Calculate the salary for Salaried employees.");
			Employee emp1 = new Salaried_Employee();
			emp1.accept(sc);
			System.out.println(emp1.toString());
			emp1.calcSal();
			break;
			
		case 2:
			System.out.println("Calculate the salary for hourly salaried employees.");
			Employee emp2 = new Hourly_Employee();
			emp2.accept(sc);
			System.out.println(emp2.toString());
			emp2.calcSal();
			break;
			
		case 3:
			System.out.println("Calculate the salary for Commissioned employees.");
			Employee emp3 = new Comm_Employee();
			emp3.accept(sc);
			System.out.println(emp3.toString());
			emp3.calcSal();
			break;
			
		case 4:
			System.out.println("Calculate the salary for Base Salary commissioned employees.");
			Comm_Employee emp4 = new BaseSalCom_Employee();
			emp4.accept(sc);
			System.out.println(emp4.toString());
			emp4.calcSal();
			BaseSalCom_Employee base = (BaseSalCom_Employee) emp4;
			break;
			
		case 5:
			System.out.println("You have entered wrong choice!");
			break;
		}

	}

}
