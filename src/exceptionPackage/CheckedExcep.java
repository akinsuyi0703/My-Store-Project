package exceptionPackage;

public class CheckedExcep {

	public static void main(String[] args) {

		System.out.println("Programme starts");
		try {
			int i=12; //java.lang.ArithmeticException -- runtime exception
			//double i=12.0;
			System.out.println(i/0);
			System.out.println("Line after Exception");// this will not execute
		} catch (Exception e) {
			System.out.println("ArithmeticException: "+e.getMessage());
			
			//e.printStackTrace();
		} 
		
		System.out.println("Programme Ends");
		
		//two exceptions cannot be handle, the first one get priority
		System.out.println("Programme starts");
		try {
			int i=12; //java.lang.ArithmeticException -- runtime exception
			//double i=12.0;
			System.out.println(i/0);
			String s=null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Handle ArithmeticException "+e.getMessage());
	 
	   } catch (NullPointerException e) {
		System.out.println("Handle NullPointerException "+e.getMessage());
		
		
	} 
		
		System.out.println("Programme Ends");


	}

}
