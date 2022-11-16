package methodsDemo;

public class ExternalClass extends UserDefinedMethod{

	public static void main(String[] args) {
		
		UserDefinedMethod obj=new  UserDefinedMethod();
		
		//Without using object to call external method
		UserDefinedMethod.helloworld1();
		 
		
		//using object to call external method
		obj.sayHi("Teddy");
		obj.square();
		obj.square3(6);
		
		//using inheritance to call external methods
		square1();//calling external methodb without using object
		helloworld1();
	}

}
