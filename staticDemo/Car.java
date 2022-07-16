package TejasSir_javarev.staticDemo;
import java.util.Scanner;
public class Car {

	private static int tsell=0;
		public static void main(String[] args) {
			Car c = new Car();
			Scanner sc =new Scanner(System.in);
			while(true) {
				System.out.println("1-> Sell");
				System.out.println("2-> Total Sell");
				System.out.println("Entre your choice:");
				int choice = sc.nextInt();
				switch(choice) {
					case 1: c.sell();
//							System.out.println(c);
						break;
					case 2: c.totalSell();
						break;
					case 3 : System.exit(0);
				}//end of switch
			}//end of while
		}//end of main
		
		static void sell() {
			tsell++;
		}//end of sell 
		static void totalSell() {
			System.out.println("Total Sell :"+tsell);
		}//end of total sell
}//end of class	
