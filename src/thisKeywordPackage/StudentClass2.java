package thisKeywordPackage;

public class StudentClass2 {

	String name;
	int rollNo;
	int age;
	
	StudentClass2(String newName, int newRollNo, int newAge){// Constructor to initialise the variables
		
		name=newName;
		this.rollNo=newRollNo;
		this.age=newAge;
		
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(age);
	}

}
