package inheritancePackage;

public class ScientificCalc extends AdvanceCalc{
	
	
	public int division(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {

		ScientificCalc obj = new ScientificCalc();
		System.out.println("Additional is: " +obj.addition(4, 5));
		System.out.println("Multiplication is: " +obj.multiplication(4, 5));
		System.out.println("Division is: " +obj.division(20, 5));
		
		

	}

}
