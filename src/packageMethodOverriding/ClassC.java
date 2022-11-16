package packageMethodOverriding;

public class ClassC extends ClassP{

	 public void add(int a, int b) {
			
			int c=a+b;
			System.out.println("Child Class Method: "+c);
		

		}
	      public void classCMethod() {
	    	  
	    	  System.out.println("Child Class Method called");
	    	  
	      }
       public static void downCasting(ClassP p) {
    	   
    	   if(p instanceof ClassP) {
    		   ClassC c=(ClassC) p; //downcasting
    		   c.classCMethod();
    	   }
	    	 
	    	  
	      }

}
