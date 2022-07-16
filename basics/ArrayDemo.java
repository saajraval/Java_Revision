package TejasSir_javarev.basics;

import java.util.Scanner;
public class ArrayDemo {

	// linear search
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int size  =sc.nextInt();
		int  [] a = new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter element :");
			a[i]=sc.nextInt();
		}
		System.out.println("The array is :" );
		for(int i=0 ;i<a.length;i++) {
			System.out.println(" "+a[i]);
		}
		System.out.println("Enter the element to search  :");
		int search =sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(search == a[i]) {
				System.out.println("Element found at position "+(i+1)+ " -> "+a[i]);
			}
		}
//		sc = null;
//		a.close(); -> not allowed as it is not a  resource 
	}
}
