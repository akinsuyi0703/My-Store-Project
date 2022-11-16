package accessModifiersTest1;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		method1();
		method3();
		//method2(); //private method from other class cannot be accessed in another class
		method4();
		
}

}
