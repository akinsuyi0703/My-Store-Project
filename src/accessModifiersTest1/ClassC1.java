package accessModifiersTest1;

public class ClassC1 {

	public static void main(String[] args) {
		
		//calling method from other class from the same package by creating the object of that class
		ClassA obj=new ClassA();
		obj.method1();
		obj.method3();
		//obj.method2(); //private method from other class cannot be accessed in another class
		obj.method4();

	}

}
