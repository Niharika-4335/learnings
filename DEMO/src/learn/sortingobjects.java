package learn;

import java.util.*;

public class sortingobjects {
	private int id;
	private String name;
	sortingobjects(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static void main(String xyz[]) {
		//initializing the array
		sortingobjects[] sob=new sortingobjects[2];
		//object instantiation
		sob[0]=new sortingobjects(1,"hi");
		sob[1]=new sortingobjects(2,"hello");
		
		Comparator<sortingobjects> com=new Comparator<sortingobjects>() {
		public int compare(sortingobjects e1,sortingobjects e2) {
	        return e1.name.compareTo(e2.name);
	    }
		};
		Arrays.sort(sob,com);

        // Print the sorted array
        for (int i = 0; i < sob.length; i++) {
            System.out.println(sob[i].getName());
        }
		
		
		
		
	}

}
