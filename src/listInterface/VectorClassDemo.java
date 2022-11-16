package listInterface;

import java.util.Vector;

public class VectorClassDemo {

	public static void main(String[] args) {
		
		Vector<Integer> vector= new Vector<Integer>();
		vector.add(13);
		vector.add(34);
		vector.add(34);
		vector.add(null);
		System.out.println(vector);
		
		//vector.clear();
		//System.out.println(vector);
		
		System.out.println(vector.capacity());
		
		//Iterate
		
		for(Integer itr:vector) {
			
			System.out.println(itr);
			System.out.println(" ");
		}
		

	}

}
