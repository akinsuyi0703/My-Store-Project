package listInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<String>();//using<String>means generic as in you can use String data only
        llist.add("C");
        llist.add("C++");
        llist.add("Java");
        llist.add("Python");
        llist.add("Python");
        llist.add(null);
        
        //print value
        System.out.println(llist);
        
        llist.addFirst("C");
        System.out.println(llist);
        
        llist.addLast("JavaScript");
        System.out.println(llist);
        
        llist.remove(4);
        System.out.println(llist);
        
        System.out.println(llist.peek());
        
        llist.pollFirst();
        System.out.println(llist);
        
        //Iterate
        
        for(int i=0; i<llist.size(); i++) {
        	System.out.println(llist.get(i));
        }
	}

}
