package fundamentals;
import java.util.Scanner;
public class Ladderif {

	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Roll No : ");
		rno=sc.nextInt();
		System.out.print("Enter Student Name : ");
		sname=sc.next();
		System.out.print("Enter Marks Of Subject 1 : ");
		s1=sc.nextInt();
		System.out.print("Enter Marks Of Subject 2 : ");
		s2=sc.nextInt();
		System.out.print("Enter Marks Of Subject 3 : ");
		s3=sc.nextInt();
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+per);
		
		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("First Class");
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
