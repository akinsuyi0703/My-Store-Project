package thisKeywordPackage;

public class ClassAUsage2 {
	
	public void methodA() {
		
		System.out.println("This is method A");
		
	}
	
    public void methodB() {
		
    	this.methodA();// to invoke current class method or invoke method A implicitly from method B
		System.out.println("This is method B");
		
	}

	public static void main(String[] args) {
	
		ClassAUsage2 obj = new ClassAUsage2();
		
		obj.methodB();

	}

}
