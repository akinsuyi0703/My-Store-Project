package onedArrayPackage;

public class OnedArrayDemo {

	public static void main(String[] args) {
		
		//DEclaration of an array
		int a[];
		int[]b;
		
		//instantiation of an array
		a=new int[5];
		
		//Declaration and Instantiation
		int c[]=new int[5];
		//how to add the elements
		c[0]=10;
		c[1]=12;
		c[2]=23;
		c[3]=34;
		//how to retrieve the elements
		System.out.println(c[4]);
		//how to print your array
		System.out.println(c.length);
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i] + " ");
			
		}
		
		//Array literal
		
		int d[]= {12, 23, 45, 56, 67,45};
		
		
		

	}

}
