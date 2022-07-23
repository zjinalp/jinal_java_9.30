package fundamentals;
import java.util.Scanner;
public class Whileloop {
	public static void main(String[] args) {
			int n,sum=5;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter N : ");
			n=sc.nextInt();
			
			do
			{
				sum=sum+n;
				n--;
			}while(n<0);
			System.out.println("Sum : "+sum);
		}
	}
