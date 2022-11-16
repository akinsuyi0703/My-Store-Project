package constuctionPackage;

public class ConstructorOverloading {
	
	public String empName;
	public int empID;
	public int age;
	
	ConstructorOverloading(String newName, int newID){
		empName=newName;
		empID=newID;
	
	}
	
	ConstructorOverloading(String newName, int newID, int newAge){
		empName=newName;
		empID=newID;
		age=newAge;
	
		}
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		ConstructorOverloading obj =new ConstructorOverloading("James", 12345);
		
		ConstructorOverloading obj1 =new ConstructorOverloading("James", 12345, 45);
		
		obj.display();
		obj1.display();
		
		
	}

}
