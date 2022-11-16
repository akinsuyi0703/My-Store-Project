package staticPackage;

public class Student1 {
	
	String stuName;
	int rollNo;
	static String collegeName = "ABC";
	
	static void staticMethod() {
		collegeName="XYZ";
		System.out.println("Static Method called");
		
	}
	
	Student1(String newName, int newRollno){
		stuName=newName;
		rollNo=newRollno;
	}
	
	public void display() {
		System.out.println(stuName);
		System.out.println(rollNo);
		System.out.println(collegeName);
	}
	
	

}
