package TejasSir_javarev;
import java.util.Scanner;

public class IndianCricketBoard {
	String type;
	int runs,wickets ,rank;
	
	public IndianCricketBoard() {
		runs = wickets = 0 ; //we can initialize two variables in a  single statement in jaVA 
	}//end of constructor  
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1 -> Bowler\n2-> Batsman\n0-> Exit \nEnter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: IndianCricketBoard ib_bol = new IndianCricketBoard();
				ib_bol.type = "Bolwer";
				System.out.println("Enter the number of wickets taken  :" );
				ib_bol.wickets = sc.nextInt();
				if(ib_bol.wickets > 350) {
					ib_bol.type="All-Rounder ";
					
				}
				else if (ib_bol.wickets>150) {
					ib_bol.rank = 5;
				}
				else if (ib_bol.wickets>100) {
					ib_bol.rank = 10;
				}
				else if (ib_bol.wickets<50) {
					ib_bol.rank = 15;
				}
				ib_bol.display_bol();
				break;
			case 2: IndianCricketBoard ib_bat = new IndianCricketBoard();
				ib_bat.type = "Batsman";
				System.out.println("Enter the number of runs scored :" );
				ib_bat.runs = sc.nextInt();
				if(ib_bat.runs > 10000) {
					ib_bat.type="All-Rounder ";		
				}
				else if (ib_bat.runs>5000) {
					ib_bat.rank = 5;
				}
				else if (ib_bat.runs>1000) {
					ib_bat.rank = 10;
				}
				else if (ib_bat.runs<1000) {
					ib_bat.rank = 15;
				}
				ib_bat.display_bat();
				break;
			case 0  : System.exit(0);
			}//end of choice 
		}//end of while 
	}//end of main 
	void display_bol () {
		System.out.println("\t Type \t Wickets \t Rank \t ");
		System.out.println("\t "+type+" \t "+wickets+" \t "+rank);
	}//end of void display
	void display_bat () {
		System.out.println("\t Type \t Runs \t Rank \t ");
		System.out.println("\t "+type+" \t "+runs+" \t "+rank);
	}//end of void display 
}//end of class

