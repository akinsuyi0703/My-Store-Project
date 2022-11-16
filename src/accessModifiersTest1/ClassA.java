package accessModifiersTest1;

public class ClassA {

	public static void main(String[] args) {
		
		method1();
		method2();
		method3();
		method4();

	}
	
	static void method1() {
		System.out.println("method1Test");
	}
	private static void method2() {
		System.out.println("method2Test");
	}
	protected static void method3() {
		System.out.println("method3Test");
	}
	public static void method4() {
		System.out.println("method4Test");
	}

	}


