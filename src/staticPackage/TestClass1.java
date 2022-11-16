package staticPackage;

public class TestClass1 {

	public static void main(String[] args) {
		Student1.staticMethod();
	
		Student1 obj =new Student1("James", 12345);
		Student1 obj1 =new Student1("Peter", 56789);
		
		obj.display();
		obj1.display();
		

	}

}
