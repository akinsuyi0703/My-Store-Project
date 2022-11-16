package packageMethodOverriding;

public class TestClassMethodOverriding {
	
	public static void main(String[] args) {
		
	ClassC obj=new ClassC();
	obj.add(4, 9);
	obj.classPMethod();
	obj.classCMethod();
	
	ClassP obj1=new ClassP();
	obj1.add(4, 9);
	obj1.classPMethod();
	//obj1.classCMethod();
	
	ClassP obj2=new ClassC();//upcasting
	obj2.add(4, 9);
	obj2.classPMethod();
	//obj2.classCMethod();
	
	/*
	 * ClassC obj3=(ClassC) new ClassP();//downcasting not practically possible in
	 * java obj3.add(4, 9); obj3.classPMethod(); //ClassCastExtention
	 * obj3.classCMethod();
	 */
	
	ClassP obj4=new ClassC();
	ClassC.downCasting(obj4);

}
}