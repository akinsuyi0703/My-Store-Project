package listInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList arrList=new ArrayList();
		arrList.add(23);
		arrList.add("ABCD");
		arrList.add('C');
		arrList.add("ABCD");
		System.out.println(arrList);

		ArrayList<Integer> arrList1=new ArrayList<Integer>();//arraylist using generic
		
		arrList1.add(23);
		arrList1.add(40);
		arrList1.add(34);
		arrList1.add(34);//it allows duplicate
		arrList1.add(null);
		System.out.println(arrList1);
		
		//Access an element in arraylist
		System.out.println(arrList1.get(2));
		
		//update an element
		System.out.println(arrList1.set(0, 37));
		System.out.println(arrList1);
		
		//count number of elements in arraylist
		System.out.println(arrList1.size());
		
		//insert elements between element
		arrList1.add(1, 67);
		
		
		//Traverse (Iterate) elements in an arraylist
		//1, For loop
		for(int i=0; i<arrList1.size();i++) {
			System.out.println(arrList1.get(i));
			System.out.println(" ");
		}
		
		//using iterator
		// when you dont know how many element available then you can use while loop. 
        //hasNext i to check weather the next element is available or not
		
		System.out.println(" ");
		
		Iterator itr=arrList1.iterator();
		while(itr.hasNext()) { 
         System.out.print(itr.hasNext());
         System.out.print(" ");
     
	}
	}

}
