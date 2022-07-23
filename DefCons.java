package fundamentals;

class Person{
	String name;
	int age;
	
	void walk() {
		System.out.println("default constructor");
		age = 21;
		name = "jinal";
		System.out.println(name + "   " + age);
	}
	
}
public class DefCons {
	public static void main(String[] args) {
		Person t = new Person();
		t.walk();
}
 
}
