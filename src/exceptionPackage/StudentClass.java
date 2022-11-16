package exceptionPackage;

public class StudentClass {
	
	//custom exception
	
	public static void result(int marks) throws Exception {
		
		System.out.println("Start of Test");
		if(marks<40) 
			throw new Exception("Student Failed in exam ");
		else 
			System.out.println("Student Passed in exam");
	}
	

	public static void main(String[] args) throws Exception {
		
		result(33);
		System.out.println("End of Test");
		
		

	}

}
