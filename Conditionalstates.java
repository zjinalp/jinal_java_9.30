package fundamentals;
import java.util.Scanner;
public class Conditionalstates {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println(" enter i :");
		for(i=0;i<10;i++)
		{
			if(i==5 || i==7)
			{
				continue;
			}
			else
			{
				System.out.println("I : "+i);
			}
		}
	}
}



