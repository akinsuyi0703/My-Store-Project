package staticPackage;



public class TestClass {
	
	//staticVariable can be use for common variable

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.stuName="James";
		obj.rollNo=12345;
		System.out.println("Student Name "+obj.stuName);
		System.out.println("Student Name "+obj.rollNo);
		System.out.println("Student Name "+Student.collegeName);

	
	
	    Student obj1=new Student();
	    obj1.stuName="Peter";
	    obj1.rollNo=54321;
	    System.out.println("Student Name "+obj1.stuName);
	    System.out.println("Student Name "+obj1.rollNo);
	    System.out.println("Student Name "+Student.collegeName);

}

}

