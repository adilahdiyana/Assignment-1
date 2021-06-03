package Assignment1;

//1.2 Pre-defined class
import java.util.Scanner; //user input
import java.text.DecimalFormat;

	public class Employees { //class of Employees
	
		Scanner input = new Scanner(System.in); //user to enter the input
		DecimalFormat df2 = new DecimalFormat("#.##"); //to avoid too many decimal places at the end of answer
	
		//declaring variables for data fields
		private String employeeName;
		private int age, phoneNumber, position;
		private char gender;
		private double salary, epf;
	
		public Employees() { //1.4 Constructor
						     //constructor with no argument
		
			//variable declaration and initialization of salary and epf
			salary = 1500;
			epf = 0.05;
		
			//user to enter the input
			System.out.println("Enter the name                                                     : "); 
			this.employeeName = input.nextLine();
		
			System.out.println("Enter the age                                                      : "); 
			this.age = input.nextInt();
		
			System.out.println("Enter the phone number:\n[Ex: 0123456789]                          : "); 
			this.phoneNumber = input.nextInt();
		
			System.out.println("Enter the position:\n[0 for clerk, 1 for supervisor, 2 for manager]: "); 
			this.position = input.nextInt();
		
			System.out.println("Enter the gender:\n[M for male, F for female]                      : "); 
			this.gender = input.next().charAt(0);
		
			//print the info of employee
			System.out.println("\nINFORMATION OF EMPLOYEE");
			System.out.println("===============================================================");
			System.out.println("Name: " + this.employeeName); //print name of employee
			System.out.println("Age: " + this.age); //print age of employee
			System.out.println("Phone number: " + this.phoneNumber); //print phone number of employee
		
			if(position == 0) { //if employee is under position of clerk
				System.out.println("Position: Clerk"); 
				System.out.println("Salary per month: "); //salary for clerk
				System.out.println("Total salaries after minus EPF for a month: RM " + df2.format(totalPaid())); //total salary for clerk
			}
		
			else if(position == 1) { //if employee is under position of supervisor
				salary = 1500; //initialize the salary for supervisor
				System.out.println("Position: Supervisor");
				System.out.println("Basic salary per month: RM " + salary); //salary for supervisor
				System.out.println("Total salaries after minus EPF for a month: RM " + df2.format(totalPaid(salary))); //total salary for supervisor
			}
		
			else if(position == 2) { //if employee is under position of manager
				//initialize the salary and elaun for manager
				salary = 2500;
				double elaun = 250; //declaring and initialization elaun variable for manager
				System.out.println("Position: Manager");
				System.out.println("Basic salary per month: RM " + salary); //salary for manager
				System.out.println("Total salaries after minus EPF for a month: RM " + df2.format(totalPaid(salary,elaun))); //total salary for manager
				System.out.println("CLOTHING RENTAL CENTRE");
				System.out.println("===========================================================");
			}	
			
		}

		//overloading method
		public double totalPaid() { //overloading method with no argument
			return salary-(salary*epf);
		}

		public double totalPaid(double salary) { //overloading method with 1 argument
			return salary-(salary*epf);
		}

		public double totalPaid(double salary, double elaun) { //overloading method with 2 arguments
			return salary-(salary*epf)+elaun;
		} 

}//end of class Employees


	


