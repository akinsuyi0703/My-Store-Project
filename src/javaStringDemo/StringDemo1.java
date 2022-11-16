package javaStringDemo;

public class StringDemo1 {

	public static void main(String[] args) {


		String str1="Hello";
		String str2="HELLO";
		String str3="Hello";
		System.out.println(str1.compareTo(str2)); //return unicode character in number
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str3));
		String s1=new String("Hello");
		System.out.println(s1);
		

	}

}
