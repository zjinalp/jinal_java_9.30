package fundamentals;
class Boxy{
	
	double width,height,depth;
	Boxy(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor Called");
		width=w;
		height=h;
		depth=d;
	} 
	Boxy(Boxy b)
	{
		System.out.println("Copy Constructor Called");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}
public class ParaCons{
	public static void main(String[] args) {
		Boxy b = new Boxy(4,5,22);
		b.volume();
		Boxy b1 = new Boxy(b);
		b1.volume();
	}
}
	  
	     
