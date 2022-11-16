package thisKeywordPackage;

public class StudentClass {

	String name;
	int rollNo;
	int age;
	
	StudentClass(String name, int rollNo, int age){// Constructor to initialise the variables
		
		this.name=name; //this is to refer current class instance variable
		this.rollNo=rollNo;
		this.age=age;
		
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(age);
	}

}
