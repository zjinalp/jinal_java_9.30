package fundamentals;

import java.util.Scanner;

public class Ifdemo {
	
	public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 int A; 
	 System.out.print(" enter A :");
	 A = sc.nextInt();
	 if(A%2==0) {
		 System.out.println("A is even");
	 }
	}
}
