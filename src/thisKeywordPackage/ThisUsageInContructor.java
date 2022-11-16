package thisKeywordPackage;

public class ThisUsageInContructor {

	
	// invoke current class constructor
	ThisUsageInContructor(){
		
		
		System.out.println("This is default constuctor");
		
	}
	
	ThisUsageInContructor(int a){
		this();
		System.out.println("This is Parameterized Constructor, and value of a "+a);
	}
	public static void main(String[] args) {
		
		ThisUsageInContructor obj=new ThisUsageInContructor(5);
		

	}

}
