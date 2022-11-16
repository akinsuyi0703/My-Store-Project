package javaPackage;

public class OperatorDemo {

	public static void main(String[] args) {
		logical();
		
		int a =5, b=11;
		
		int c=a+b; //plus sign is an operator while a and b are operand
		System.out.println("Addition is : " +c);
		System.out.println("Subraction is : " +(b-a));
		System.out.println("Multiplication is : " +(b*a));
		System.out.println("Division is : " +(b/a));
		System.out.println("Modules is : " +(b%a));//remiander
		
		//System.out.println("Increment is : " +(++a));
		
		System.out.println("Increment is : " +(a++));
		System.out.println("a is : " +(a));
		
		System.out.println("Decrement is : " +(a--));
		System.out.println("Derement is : " +(--a));
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);

		
		
	}
	public static void logical() {
		
		int a=50, b=17;
		
		//logical operator
		System.out.println((a>b)&&(a!=b)); //both are true that means true
		System.out.println((a>b)&&(a==b));//one is true and the other is false sothe answer is false
		System.out.println((a<b)&&(a==b));//both are flse that means false
		
		//OR Operator
		System.out.println((a>b)||(a!=b));//true or false=true
		System.out.println((a>b)||(a==b));//false or false=false
		System.out.println((a<b)||(a==b));//false or false=false

	
	}	

}
