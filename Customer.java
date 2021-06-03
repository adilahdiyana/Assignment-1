package Assignment1;

//1.2 Pre-defined class
import java.util.Scanner; //user input
import java.text.DecimalFormat;

public class Customer { //class of Customer
						//1.3 User defined class
	
	Scanner input = new Scanner(System.in); //user to enter the input
	DecimalFormat df2 = new DecimalFormat("#.##"); //to avoid too many decimal places at the end of answer
	
	//declaring variables for data fields
	private String customerName;
	private int age, phoneNumber, selection, quantity;
	private char gender;
	private double RentPrice, totalPrice;
	
	public Customer() { //1.4 Constructor
						//constructor with no argument
		
		System.out.println("INFORMATION OF EMPLOYEE");
		System.out.println("===============================================================");
		//user to enter the input
		System.out.print("Enter the name: "); //print customer name
		this.customerName = input.nextLine();
			
		System.out.print("Enter the age: "); //print age customer
		this.age = input.nextInt(); 
		
		System.out.print("Enter the gender:\n[M for male, F for female]: "); //print customer gender
		this.gender = input.next().charAt(0);
	
		System.out.print("Enter the phone number:\n[Ex: 0123456789]: "); //print phone number customer
		this.phoneNumber = input.nextInt();
		
		System.out.print("Enter the type of cloth that you want to select and rent [0 for Fashion Modern, 1 for Traditional Customs, 2 for Dinner Dress]: "); //selection type of cloth for customer
		this.selection = input.nextInt();
		
			switch(selection) {
				
			case 1 :System.out.print("Select the brand of cloth:\n[0 for NIKE, 1 for ZARA, 2 for GUCCI]: "); //selection for cloth type of Fashion Modern
					this.selection = input.nextInt();
					
					if (selection == 0) { //selection for NIKE
						System.out.print("Enter number of rental quantity: ");
						this.quantity = input.nextInt();
											
						if(quantity <= 10) { //start for quantity less or equal to 10
							this.RentPrice = 120; // price for NIKE if rent less than or equal 10 clothes
							totalPrice = totalRentPrice(); //initialize the total price for rental quantity
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: NIKE " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
							} //end for quantity less than 10
					
						else { //start of quantity more than 10
							//initialize the discount and new price
							double discount = 0.2;
							double newPrice= 120-(120*discount);  //new price for NIKE if rent more than 10 clothes 
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: NIKE " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
							System.out.println("CLOTHING RENTAL CENTRE");
							System.out.println("===================================");
							} //end for quantity more than 10
						} //end for selection 0
			
					if (selection == 1) { //selection for ZARA
						System.out.print("Enter number of rental quantity: ");
						this.quantity = input.nextInt();
												
						if(quantity <= 10) { //start for quantity less or equal to 10
							this.RentPrice = 150; // price for ZARA if rent less than or equal 10 clothes
							totalPrice = totalRentPrice(); //initialize the total price for rental quantity
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: ZARA " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
							} //end for quantity less than 10
					
						else { //start of quantity more than 10
							//initialize the discount and new price
							double discount = 0.2;
							double newPrice= 150-(150*discount);  //new price for ZARA if rent more than 10 clothes 
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: ZARA" ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
							System.out.println("CLOTHING RENTAL CENTRE");
							System.out.println("===================================");
							} //end for quantity more than 10
						} //end for selection 1
			
					if (selection == 2) { //selection for GUCCI
						System.out.print("Enter number of rental quantity: ");
						this.quantity = input.nextInt();
						
						if(quantity <= 10) { //start for quantity less or equal to 10
							this.RentPrice = 180; // price for GUCCI if rent less than or equal 10 clothes
							totalPrice = totalRentPrice(); //initialize the total price for rental quantity
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: GUCCI " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
							} //end for quantity less than 10
					
						else { //start of quantity more than 10
							//initialize the discount and new price
							double discount = 0.2;
							double newPrice= 180-(180*discount);  //new price for GUCCI if rent more than 10 clothes 
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: GUCCI " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
							System.out.println("CLOTHING RENTAL CENTRE");
							System.out.println("===================================");
							} //end for quantity more than 10
						} //end for selection 2
					
							break; //break for switch case 1 
							
			case 2 :System.out.print("Select the brand of cloth:\n[0 for Kilts , 1 for Tracht, 2 for Gho]: "); //selection for cloth type of Traditional Customs
			this.selection = input.nextInt();
			
			if (selection == 0) { //selection for Kilts
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //start for quantity less or equal to 10
					this.RentPrice = 213; // price for Kilts if rent less than or equal 10 clothes
					totalPrice = totalRentPrice(); //initialize the total price for rental quantity
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Kilts " ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //start of quantity more than 10
					//initialize the discount and new price
					double discount = 0.2;
					double newPrice = 213-(213*discount);  //new price for Kilts if rent more than 10 clothes 
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Kilts " ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for selection 0
	
			if (selection == 1) { //selection for Tracht
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
				
				if(quantity <= 10) { //start for quantity less or equal to 10
					this.RentPrice = 313; // price for Tracht if rent less than or equal 10 clothes
					totalPrice = totalRentPrice(); //initialize the total price for rental quantity
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Tracht" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //start of quantity more than 10
					//initialize the discount and new price
					double discount = 0.2;
					double newPrice = 313-(313*discount);  //new price for Tracht if rent more than 10 clothes 
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Tracht" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for selection 1
	
			if (selection == 2) { //selection for Gho
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //start for quantity less or equal to 10
					this.RentPrice = 413; // price for Gho if rent less than or equal 10 clothes
					totalPrice = totalRentPrice(); //initialize the total price for rental quantity
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Gho" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //start of quantity more than 10
					//initialize the discount and new price
					double discount = 0.2;
					double newPrice = 413-(413*discount);  //new price for Gho if rent more than 10 clothes 
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Gho" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for selection 1
			
					break; //break for switch case 2
					
			case 3 :System.out.print("Select the brand of cloth:\n[0 for Frozen , 1 for Roll, 2 for Vintage]: "); //selection for cloth type of Dinner Dress
			this.selection = input.nextInt();
			
			if (selection == 0) { //selection for Frozen
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //start for quantity less or equal to 10
					this.RentPrice = 153; // price for Frozen if rent less than or equal 10 clothes
					totalPrice = totalRentPrice(); //initialize the total price for rental quantity
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Frozen " ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //start of quantity more than 10
					//initialize the discount and new price
					double discount = 0.2;
					double newPrice = 153-(153*discount);  //new price for Frozen if rent more than 10 clothes 
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Frozen" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for selection 0
	
			if (selection == 1) { //selection for Roll
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //start for quantity less or equal to 10
					this.RentPrice = 253; // price for Roll if rent less than or equal 10 clothes
					totalPrice = totalRentPrice(); //initialize the total price for rental quantity
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Roll" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //start of quantity more than 10
					//initialize the discount and new price
					double discount = 0.2;
					double newPrice= 253-(253*discount);  //new price for Roll if rent more than 10 clothes 
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Roll" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for selection 1
	
			if (selection == 2) { //selection for Vintage
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //start for quantity less or equal to 10
					this.RentPrice = 353; // price for Vintage if rent less than or equal 10 clothes
					totalPrice = totalRentPrice(); //initialize the total price for rental quantity
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Vintage" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //start of quantity more than 10
					//initialize the discount and new price
					double discount = 0.2;
					double newPrice = 353-(353*discount);  //new price for Vintage if rent more than 10 clothes 
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Vintage" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ this.RentPrice); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ totalPrice); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for selection 2
			
					break; //break for switch case 3
			}
	}
			
			
	public double totalRentPrice() { //overloading method with no argument
		return quantity*this.RentPrice;
	}
	
	public double totalRentPrice(double newPrice) { //overloading method with 1 argument
		return quantity*newPrice;
	}
	
} //end class of Customer
	
	


