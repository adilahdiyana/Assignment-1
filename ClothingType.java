package Assignment1;

public class ClothingType { //class of ClothingType
	
private String material, brand; //declaring type and brand variables
	
	public ClothingType(String m, String b) { //1.4 Constructor 
											//constructor with 2 arguments
		
		//initialize of type and brand variables
		this.material = m;
		this.brand= b;
		
	}
	
	//1.3 User define class
	public String printInfoFashionModern() { //method to print the info of FashionModern
		return "Brand	          : " + this.brand 
				+ "\nMaterial          : " + this.material 
				+ "\nStocks	          : 10, 15, 20"
				+ "\nSize	          : S, M L"
				+ "\nRent price per day: RM 120, RM 220, RM 320";
	}
	
	public String printInfoTraditionalCustoms() { //method to print out the info of TraditionalCustoms
		return "Brand		  : " + this.brand
				+ "\nMaterial          : " + this.material
				+ "\nStocks	          : 5, 6, 11"
				+ "\nSize	          : S, M, XL"
				+ "\nRent price per day: RM 213, RM 313, RM 413";
	}
		
	public String printInfoDinnerDress() { //method to print out the info of DinnerDress
		return "Brand		  : " + this.brand
				+ "\nMaterial          : " + this.material 
				+ "\nStocks	          : 15, 12, 10"
				+ "\nSize	          : M, L, XXL"
				+ "\nRent price per day: RM 153, RM 253, RM 353";
	}
	
} //end class of ClothingType

