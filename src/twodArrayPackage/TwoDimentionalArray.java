package twodArrayPackage;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		//DEclaration of an array
				int a[][];
				int[][]b;
				
				//instantiation of an array
				a=new int[5][];
				
				//Declaration and Instantiation
				int c[][]=new int[2][2];
				
				int d[][]= {{2,3}, {3,5}, {5,7}};
				
				for(int i=0; i<3; i++) {
					for(int j=0; j<2;j++) {
						System.out.print(d[i][j] + "  ");
					}
					
					System.out.println();
					
				}
	}

}
