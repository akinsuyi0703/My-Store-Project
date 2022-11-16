package constuctionPackage;

public class ParameterizesConstructor {
	
	public String empName;
	public int empID;
	
	ParameterizesConstructor(String newName, int newID){
		empName=newName;
		empID=newID;
		
	}
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
	}


	public static void main(String[] args) {
		
		ParameterizesConstructor obj = new ParameterizesConstructor("James", 12345);
				obj.display();
		
		

	}

}
