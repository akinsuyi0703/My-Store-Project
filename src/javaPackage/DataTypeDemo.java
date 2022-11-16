package javaPackage;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		boolean b1=true;
		boolean b2=false;
		boolean b3=(10>2);
		
		System.out.println("The value of b1: " +b1);
		System.out.println("The value of b2: " +b2);
		System.out.println("The value of b3: " +b3);
		
		char ch1 ='a';
		char ch2 ='B';
		char ch3= 65; //use unicode use system for universal while ASCII is for USA
		
		System.out.println("The value of ch1: " +ch1);
		System.out.println("The value of ch2: " +ch2);
		System.out.println("The value of ch3: " +ch3);
		
		byte a1=100;
		byte a2=-120;
		short a3=130;
		
		int i =1234567891;
		long l=1234576567;
		long g= 12345657487976548L;
		
		System.out.println("The value of a1: " +a1);
		System.out.println("The value of a2: " +a2);
		System.out.println("The value of a3: " +a3);
		System.out.println("The value of i: " +i);
		System.out.println("The value of l: " +l);
		System.out.println("The value of g: " +g);
		
		float f = 10.5f;
		double d =123.23;
		int n=(int) 122.23;//downcasting from higher datatype to lower datatype
		double t=(double)100;//upcasting from lower datatype to high datatype
		
		
		System.out.println("The value of f: " +f);
		System.out.println("The value of d: " +d);
		System.out.println("The value of n: " +n);
		System.out.println("The value of t: " +t);

	}

}
