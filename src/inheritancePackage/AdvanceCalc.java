package inheritancePackage;

public class AdvanceCalc extends calc{

	public static void main(String[] args) {
		
		//Single level inheritance
		
		AdvanceCalc obj=new AdvanceCalc();
		System.out.println("Additional is: " +obj.addition(4, 5));
		System.out.println("Multiplication is: " +obj.multiplication(4, 5));
		
		calc obj1 =new AdvanceCalc();
		System.out.println("Additional is: " +obj1.addition(4, 5));
		//System.out.println("Multiplication is: " +obj1.multiplication(4, 5));
		
        calc obj2= new calc();
        System.out.println("Additional is: " +obj2.addition(4, 5));
		//System.out.println("Multiplication is: " +obj2.multiplication(4, 5));
		
		//AdvanceCalc obj3= new calc();
       //System.out.println("Additional is: " +obj3.addition(4, 5));
		//System.out.println("Multiplication is: " +obj3.multiplication(4, 5));
		
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}

}
