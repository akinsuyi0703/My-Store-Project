package superKeywordPackage;

public class EmpChild extends EmpParent{
	
	int empID =1234;
	String empName ="Alvin";
	
	EmpChild(){
		super();// with or without super()it will call parent constructor
		System.out.println("This is Child Constructor");
		
	}
	
	public void empMethod() {
		System.out.println("This is Child method");
	}

	
	public void showRecord() {
		super.empMethod();
		System.out.println("Emp ID: "+super.empID);
		System.out.println("Emp Name: "+empName);
	}

}
