package thisKeywordPackage;

public class ThisUsageClass {

	// this can be passed as an arqument in the method call
	public void methodA(ThisUsageClass obj) {
		
		System.out.println("This is method A");
	}
	
    public void methodCall() {
    	methodA(this);
		
		System.out.println("This is method A");
	}
	public static void main(String[] args) {
		
		ThisUsageClass obj1 = new ThisUsageClass();
		obj1.methodCall();
		
		

	}

}
