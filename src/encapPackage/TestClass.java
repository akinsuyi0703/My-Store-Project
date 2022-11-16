package encapPackage;

public class TestClass {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setStuName("Jame");
		obj.setStuRoll(12345);
		obj.setStuAge(18);
		
		System.out.println("Student Name is: "+obj.getStuName());
		System.out.println("Student Roll# is: "+obj.getStuRoll());
		System.out.println("Student Age is: "+obj.getStuAge());
			

	}

}
