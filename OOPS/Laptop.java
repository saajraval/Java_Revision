package TejasSir_javarev.OOPS;

public class Laptop {

	private String name;
	private String brand;
	private int price ;

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.name ="Dell G3 3500";
		Printer p1 = new Printer();
		p1.setName("Dell Gaming");
		System.out.println(p1.getName());
		System.out.println(p1);
	}//end of main
}//end of class laptop

class Printer {
	private String name,brand;
	private int price;
	//accessors 
//	getters & setters 
	
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
//		name= name ; -> here the name variable refers to the local scope of method only........
//		so name is passed in name itself  thus we need to write this keyword 
		this.name= name ;// here this.name refers to printer class
	}
	
		
}//end of class printer