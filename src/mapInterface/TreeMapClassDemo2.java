package mapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClassDemo2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String>hm=new TreeMap<>();
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
