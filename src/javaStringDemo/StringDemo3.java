package javaStringDemo;

public class StringDemo3 {

	public static void main(String[] args) {


		String str="54632";
		int num = Integer.parseInt(str);
		System.out.println(num);
		System.out.println(num+4);
		int num1=Integer.valueOf(num);
		System.out.println(num1);
		
		int ivar =123;
		String str2= String.valueOf(ivar);
		System.out.println("String is: "+str2);
		System.out.println(555+str2);
		
		int ivar1 =123;
		String str1=Integer.toString(ivar1);
		System.out.println("String is: "+str1);
		System.out.println(555+str1);
		
	}

}
