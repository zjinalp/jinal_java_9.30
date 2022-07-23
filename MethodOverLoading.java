package fundamentals;

public class MethodOverLoading {
	void college() {
		System.out.println("ssit is my college");
	}
	void college(int a) {
		System.out.println("my rank " +a);
}
	
    void college(int a, String j) {
    	System.out.println("my rank and my name");
    }
    
    public static void main(String[] args, String jinal) {
    	MethodOverLoading m = new MethodOverLoading();
    	m.college();
    	m.college(2);
    	m.college(2,jinal);
	}
}
