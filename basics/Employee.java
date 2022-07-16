package TejasSir_javarev.basics;

import java.util.Scanner;

public class Employee {

	float salary ,tax;
	String name ;
	
	
	public Employee() {
		salary = 10000;
		tax =0 ;
	}//end of constructor 
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.getData();
		e.printData();
	}//end of main 
	
	void getData() {
		System.out.println("Enter you name  : ");
		Scanner sc  =new Scanner(System.in);
		name=sc.next();
	}//end of getData
	
	void printData() {
		System.out.println("Name \t Salary \t Tax ");
		System.out.println(""+name+"\t "+salary+" \t "+tax);
	}//end of printData
}//end of class 
