package TejasSir_javarev.staticDemo;
import java.util.Scanner;

public class CarSirLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1-> Sell\n2-> Total Sell\n0-> Exit\n Enter yout choice:");
			int ch = sc.nextInt();
			switch(ch) {
				case 1: Cars c = new Cars();
					break;
				case 2:  System.out.println("Total Sell -> "+Cars.getTotal());
					break;
				case 0: System.exit(0);
			}//end choice 
		}//end of while
	}//end of main
}//end of class

class Cars{
	Cars(){
		total_Sell++;
	}
	private static int total_Sell=0;
	public static int getTotal() {
		return total_Sell;
	}
}