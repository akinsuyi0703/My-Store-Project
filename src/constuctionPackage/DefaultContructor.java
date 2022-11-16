package constuctionPackage;

public class DefaultContructor {
	
	//default construction invoke
	public String empName;
	public int empID;
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
	}

	public static void main(String[] args) {
		
		DefaultContructor obj =new DefaultContructor();
		obj.display();

	}

}
