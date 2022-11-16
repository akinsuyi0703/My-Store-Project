package javaStringDemo;

public class StringDemo2 {

	public static void main(String[] args) {


		String act="Welcome to Java for Selenium Session";
		String exp="Welcome to Java for Selenium Session";
		
		boolean result=act.equals(exp);
		System.out.println(result);

		
		String actual="welcome to Java for Selenium Session";
		String expect="Welcome to Java for Selenium Session";
		
		boolean result1=actual.equalsIgnoreCase(expect);
		System.out.println(result1);
		
		String str1="Hello Guys ";
		String str2="Welcome to Java for Selenium Session";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.charAt(6));
		System.out.println(str1.contains("Java"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2.substring(8));
		System.out.println(str2.startsWith("Welcome"));
		System.out.println(str2.endsWith("Selenium"));
		System.out.println(str2.replace("S", "H"));
		

	}

}
