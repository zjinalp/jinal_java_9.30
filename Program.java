package fundamentals;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your current service year:"  );
		int year = sc.nextInt();
		if(year > 5){
		     System.out.print( "enter ur sal :" );
		     float salary  = sc.nextFloat();
		     float c = (float) (0.05*(salary));
		     System.out.println(c);
		     System.out.println("salary increased");
		       
		}
		 else{
			System.out.print("your service year is less than 5");
		}	
	}
  
}
