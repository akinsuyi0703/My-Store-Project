package superKeywordPackage;

public class Child extends Parent{
	
	int empAge;
	
	
	Child(int empID, String empName, int empAge){
		super(empID,empName);
		this.empAge=empAge;
		
	}
	
	

	
	public void showRecord() {
		//super.empMethod();
		System.out.println("Emp ID: "+super.empID);
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Age: "+empAge);
	}

}
