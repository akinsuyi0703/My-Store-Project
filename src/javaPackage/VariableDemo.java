package javaPackage;

public class VariableDemo {

	//Global variable
	static int k=20;
	
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		obj.method();
		obj.method2();
		System.out.println("The value of k is :" + k);
		

	}
	public void method() {
		
		//Local variable
		//int i; //Declaration of variable
	    //i=10; //Initialisation of Variable
		
		int j=10; //Declaration and Initialisation
		System.out.println("The value of j is :" + j);//concantination
		System.out.println("The value of k is :" + k);
		
	}
    public void method2() {
		
		System.out.println("The value of k is :" + k);
		
	}

}
