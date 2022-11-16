package listInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

	public static void main(String[] args) {
	
		Student obj =new Student("Student1", 20, 123);
		Student obj1 =new Student("Student2", 21,1234);
		Student obj2 =new Student("Student3", 22, 12345);
		
		ArrayList<Student> arrList=new ArrayList<Student>();//generic
		
	    arrList.add(obj);
	    arrList.add(obj1);
	    arrList.add(obj2);
	    
	    
	    
	    //Iterate through Iterator
	    Iterator<Student> itr=arrList.iterator();
		while(itr.hasNext()) { 
			Student stu=itr.next();
         System.out.print(stu.stuName);
         System.out.println(stu.age);
         System.out.print(stu.rollNo);
         System.out.print(" ");
     
	}

	}

}
