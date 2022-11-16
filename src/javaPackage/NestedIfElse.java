package javaPackage;

public class NestedIfElse {

	public static void main(String[] args) {
		

int n1=3, n2=4, n3=10, largestNo;

if(n1>n2) {
	if(n1>n3) {
		largestNo=n1;
	}else {
		largestNo=n3;
	}
}else {
		if(n2>n3) {
		largestNo=n2;	
		}else {
			largestNo=n3;
	}
}
System.out.println("Largest no is "+ largestNo);
}
}