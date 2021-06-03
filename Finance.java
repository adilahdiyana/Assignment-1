package Assignment1;

import java.text.DecimalFormat; //1.2 Pre-defined class
								//to avoid too many decimal places at the end of calculation

public class Finance { //class of Finance
	
	private double employeeSalary, inventExpenses, utilitiesFees, maintenanceFees, advertiseFees, sales; //declaring variables of data fields
	
	public Finance(double es, double ie, double uf, double mf, double af, double s) { //1.4 Constructor
												   // constructor with 6 arguments
		
		DecimalFormat df2 = new DecimalFormat("#.##"); //to avoid too many decimal places at the end of answer
	
		//initialization of data fields
		this.employeeSalary = es;
		this.inventExpenses = ie;
		this.utilitiesFees = uf;
		this.maintenanceFees = mf;
		this.advertiseFees = af;
		this.sales = s;
		
		//print the finance of company
		System.out.println("FINANCIAL STATEMENT OF A MONTH");
		System.out.println("=================================");
		System.out.println("Total employees salary	: RM " + this.employeeSalary);
		System.out.println("Total inventory fees	: RM " + this.inventExpenses);
		System.out.println("Total utilities fees	: RM " + this.utilitiesFees);
		System.out.println("Total maintenance fees  : RM " + this.maintenanceFees);
		System.out.println("Total advertisement fees: RM " + this.advertiseFees);
		System.out.println("Total expenses          : RM " + df2.format(totalExpenses()));
		System.out.println("Total sales             : RM " + this.sales);
		System.out.println("Net profit              : RM " + df2.format(netProfit()));
		System.out.println("CLOTHING RENTAL CENTRE");
		System.out.println("=================================");
	}
	
	public double totalExpenses() { //method to calculate total expenses
		return employeeSalary + inventExpenses + utilitiesFees + maintenanceFees + advertiseFees;
	}
	
	public double netProfit() { //method to calculate net profit
		return sales-totalExpenses();
	}
	
} //end of class Finance
				
	
	


