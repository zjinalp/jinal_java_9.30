package fundamentals;
import java.util.Scanner;
public class Forlooop {
	
	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		
		for(i=n;i>=1;i--)
		{
			sum = sum+i;
		}
		System.out.println("Sum : "+sum);
	}

}
