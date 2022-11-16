package setInterface;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClassDemo2 {

	public static void main(String[] args) {

       //TreeSet<Integer> hash=new TreeSet<>();
	   Set<Integer> hash=new TreeSet<>();
       hash.add(5);
       hash.add(15);
       hash.add(43);
       hash.add(54);
       hash.add(5);
       hash.add(45);
       //hash.add(null);
       //hash.add(null);
       //System.out.println(hash);
       
       for(Integer itr: hash) {
    	   System.out.println(itr);
    	   
       }
       System.out.println("getting particular element"); //converting set to arrayList to get particular element
       
       ArrayList<Integer> ar=new ArrayList<>(hash);
       System.out.println(ar.get(3));

	}

}
