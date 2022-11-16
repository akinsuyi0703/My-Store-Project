package exceptionPackage;

public class CheckedExcep3 {

	public static void main(String[] args) {

		System.out.println("Programme starts");
		
		try {
		int i=10;
		System.out.println(i/2);
        String str = "ABCD";
        str=null; 
        System.out.println(str.length()); //NullPointerException -- runtime exception
		}finally { //finally block will always execute regardless of any exception

			System.out.println("This is finally block");
		}

		System.out.println("Programme Ends");

	}

}
