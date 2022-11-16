package setInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class LinkedHashSetClassDemo2 {

	public static void main(String[] args) {

       HashSet<Integer> hash=new HashSet<>();
       hash.add(13);
       hash.add(43);
       hash.add(54);
       hash.add(5);
       hash.add(null);
       hash.add(null);
       //System.out.println(hash);
       
       for(Integer itr: hash) {
    	   System.out.println(itr);
    	   
       }
       System.out.println("getting particular element"); //converting set to arrayList to get particular element
       
       ArrayList<Integer> ar=new ArrayList<>(hash);
       System.out.println(ar.get(2));

	}

}
