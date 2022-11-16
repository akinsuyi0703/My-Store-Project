package objectAndClass;

public class ObjectAndClassDemo {
	
	int n1=13;
	int n2=12;
	static int result;
	
	public void addition() {
		result=n1+n2;
	}

	public static void main(String[] args) {
		
	 ObjectAndClassDemo obj=new ObjectAndClassDemo();
	 ObjectAndClassDemo obj1=new ObjectAndClassDemo();
		obj.n1=10;
		obj.n2=12;
		//obj1.n1=10;
		//obj1.n2=12;
	
		obj.addition();
		obj1.addition();
		System.out.println(result);
		

	}

}
