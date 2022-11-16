package encapPackage;

public class Student {

	private String stuName;
	private int stuRollNo;
	private int age;
	
	
	public String getStuName() {
		return stuName;
	}
	
	public int getStuRoll() {
		return stuRollNo;
	}
	
	public int getStuAge() {
		return age;
	}
	
	public void setStuName(String newName) {
		stuName=newName;
		
	}
	
    public void setStuRoll(int newRollNo) {
    	stuRollNo=newRollNo;
		
	}

    public void setStuAge(int newAge) {
    	age=newAge;
	
}


}
