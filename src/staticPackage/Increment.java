package staticPackage;

public class Increment {
	
	int inc; //non static increment
	
	Increment(){
		inc++;
		System.out.println(inc);
	}

	public static void main(String[] args) {
		
		Increment obj = new Increment();
		Increment obj1 = new Increment();
		Increment obj2 = new Increment();

	}

}
