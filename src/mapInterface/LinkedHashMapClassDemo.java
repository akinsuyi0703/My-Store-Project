package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapClassDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "James");
		hm.put(2, "Peter");
		hm.put(3, "Alvis");
		hm.put(4, "John");
		hm.put(5, "null");
		hm.put(6, "null");
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> data:hm.entrySet()) {
			System.out.println("Key is: "+data.getKey()+" "+ "Value is: "+data.getValue());
		}


		

	}

}
