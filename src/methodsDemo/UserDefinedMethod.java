package methodsDemo;

public class UserDefinedMethod {
	
	static int a=4, result;
	
	public void helloworld(){
		
		System.out.println("Hello World");
		
	}
	
    static public void helloworld1(){
		
		System.out.println("Hello World");
		
	}
    
    public int square() {
    	result = a*a;
    	return result;
    }
    static public int square1() {
    	result = a+a;
    	return result;
    }
    public int square3(int a) {
    	result = a*a;
    	return result;
    }
    public void sayHi(String name) {
    	System.out.println("Hi " +name);
    }
	public static void main(String[] args) {
	
		UserDefinedMethod obj = new UserDefinedMethod();
		obj.helloworld();
		helloworld1();
		int x=obj.square(); //return and store the result into x variable
		System.out.println(x);
		int x1=square1();
		System.out.println(x1);
		obj.sayHi("Peter");
		int x3=obj.square3(5);
		System.out.println(x3);

	}

}
