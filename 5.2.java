import java.util.Scanner;

class Employee{
	int emp_id;
	String emp_name;
	String emp_designation;
	int age;
	double salary;
	public void getempdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id, Name, Designation, Age and Salary: ");
		emp_id = sc.nextInt();
		sc.nextLine();
		emp_name = sc.nextLine();
		emp_designation = sc.nextLine();
		age = sc.nextInt();
		salary = sc.nextDouble();
	}
	public void displayempdetails()
	{
		System.out.println("Employee Id is " + emp_id);
		System.out.println("Employee Name is " + emp_name);
		System.out.println("Employee Designation is " + emp_designation);
		System.out.println("Employee Age is " + age);
		System.out.println("Employee Salary is " + salary);
	}
}
public class Lab5_2{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getempdetails();
		e1.displayempdetails();
	}
}