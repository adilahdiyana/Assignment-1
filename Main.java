package Assignment1;

public class Main {

	public static void main(String[] args) { //class Main
		
		ClothingRentalCentre CRB = new ClothingRentalCentre("Top of Clothing Rental", "No. 136, Jalan Tamingsari, 26531, Kuala Lumpur", "https://clothingrentalkl.com", 58836460);
		System.out.println();
		
		AdvertisementMarketing am = new AdvertisementMarketing();
		System.out.println();
		
		System.out.println("INFORMATION OF CLOTHING");
		System.out.println("=======================");
		
		ClothingType fashionmodern = new ClothingType("NIKE, ZARA, GUCCI", "Fabric, High cotton, Canvas");
		System.out.println(fashionmodern.printInfoFashionModern());
		System.out.println();
		
		ClothingType traditionalcustoms = new ClothingType("Kilts, Tracht, Gho", "Fabrics, Fabrics, Fabric");
		System.out.println(traditionalcustoms.printInfoTraditionalCustoms());
		System.out.println();
		
		ClothingType dinnerdress = new ClothingType("Frozen, Roll, Viltage", "Fabric, Fabric rolls, Woven fabrics");
		System.out.println(dinnerdress.printInfoDinnerDress());
		System.out.println();
		
		Customer customer = new Customer();
		System.out.println();
		
		Employees emp = new Employees();
		System.out.println();
		
		Sales s = new Sales(3462.52);
		System.out.println();
		
		Finance fin = new Finance(425.20, 777.41, 300.85, 654.10, 392.14, 21563.48);
		System.out.println();

	}

}
