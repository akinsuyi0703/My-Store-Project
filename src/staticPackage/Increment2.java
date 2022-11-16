package staticPackage;

public class Increment2 {
	
	static int inc; //non static increment
	
	Increment2(){
		inc++;
		System.out.println(inc);
	}

	public static void main(String[] args) {
		
		Increment2 obj = new Increment2();
		Increment2 obj1 = new Increment2();
		Increment2 obj2 = new Increment2();

	}

}
