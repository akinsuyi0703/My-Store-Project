package accessModifiersTest2;

import accessModifiersTest1.ClassA;

public class ClassC extends ClassA{

	public static void main(String[] args) {
		//method1(); //default cannot be accessed in another package
		//method2(); //private cannot be accessed in anothe class or package
		method3(); //protector can be accessed in another package with an extends keyword if it's from that extends class
		method4(); //public can be accessed any where
		

	}

}
