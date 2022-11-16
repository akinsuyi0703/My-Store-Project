package packageMethodOverloading;

public class ClassA {
	
    public void add(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c) {
		
		int d=a+b+c;
		System.out.println(d);
	}
    public void add(double a, int b, int c) {
		
		double d=a+b+c;
		System.out.println(d);
	}
    public void add(int a, int b, double c) {
		
		double d=a+b+c;
		System.out.println(d);
	}

}
