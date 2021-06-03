package Assignment1;

import java.text.DecimalFormat; //1.2 Pre-defined class
								//to avoid too many decimal places at the end of calculation

public class Sales { //class of Sales
					 //1.3 User defined class
	
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	private double sales; //declaring sales variable
	
	public Sales(double sales) { //1.4 Constructor
								 //constructor with 1 argument
		
		this.sales = sales; //initialize of sales variable
		
		//print the sales of company
		System.out.println("SALES REPORT");
		System.out.println("=================================================");
		System.out.println("Generally an average of sales every day: RM " + this.sales);
		System.out.println("Sales in a week                        : RM " + df2.format(totalSalesWeek()));
		System.out.println("Sales in a month                       : RM " + df2.format(totalSalesMonth()));
		System.out.println("CLOTHING RENTAL CENTRE");
		System.out.println("==================================================");
	}
	
	public double totalSalesWeek() { //method to calculate total sales in a week
		return this.sales*7; //7 is the number of day in a week
	}
	
	public double totalSalesMonth() { //method to calculate total sales in a month
		return this.sales*30; //30 is the number of day in a month
	}
	
} //end of class Sales
