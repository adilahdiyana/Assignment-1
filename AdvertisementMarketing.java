package Assignment1;

public class AdvertisementMarketing { //class of AdvertisementMarketing
									  //1.3 User defined class
	
	private double price, discount; //declaring a variable
	
	AdvertisementMarketing() { //1.4 Constructor with no argument
		
		//variable declaration and initialization of price and discount
		price = 120;
		discount = 0.5;
		
		printInfo(price,discount); //calling method
		
	}
	
public void printInfo(double price, double discount) { //1.4 Constructor
									                  //method with 2 arguments
	
	System.out.println("REASONABLY PRICE OF CLOTHING RENTAL");
	System.out.println("The rent is at the lowest and affordable prices as RM " + price + " ."); //print the price
	System.out.println("If you rent one of the cloths, you also will get a discount at " + discount*100 + " % just in one day. So, hurry up to get a discount!"); //print the discount
	System.out.println("CLOTHING RENTAL CENTRE");
	System.out.println("====================================================");
	
	}

} //end of class AdvertisementMarketing


