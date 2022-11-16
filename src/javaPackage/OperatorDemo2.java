package javaPackage;

public class OperatorDemo2 {

	public static void main(String[] args) {
		
int a=50, b=17, d=1;
int c=a+b;
d+=a; 

String f;

f=(a>b)?"Passed":"Failed";

if(a>b) {
	System.out.println("Passed");
}else {
	System.out.println("Failed");
}

		
		//logical operator
		System.out.println((a>b)&&(a!=b)); //both are true that means true
		System.out.println((a>b)&&(a==b));//one is true and the other is false so the answer is false
		System.out.println((a<b)&&(a==b));//both are false that means false
		
		//OR Operator
		System.out.println((a>b)||(a!=b));//true or false=true
		System.out.println((a>b)||(a==b));//true or false=true
		System.out.println((a<b)||(a==b));//false or false=false
		
		//NOT Operator
		System.out.println(!((a<b)&&(a==b)));//false or false=true
		System.out.println(!((a>b)&&(a!=b)));//true or true=false
		System.out.println(!((a<b)&&(a==b)));//false or false=true
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		



		
		
	}
	
	
	

}
