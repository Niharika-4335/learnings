package learn;
import java.util.*;
public class IteratorExample {
     public static void main(String xyz[]) {
    	 List<Integer> a=new ArrayList<>();
    	 a.add(3);
    	 a.add(5);
    	 a.set(1,2);
    	 System.out.println(a.get(0));
    	 a.remove(0);
    	 //Iterable-interface which conatains iterable method which returns iterator object 
    	 Iterator it=a.iterator();
    	 while(it.hasNext()) {
    		 System.out.println(it.next());
    		 
    	 }
    	 
     }
}
