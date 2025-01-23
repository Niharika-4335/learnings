package learn;
import java.util.*;
class A1 implements Comparator<A1>{
	private int id;
	private String name;
	private String dept;
//	public A1() {
//		super();
//	}
	public A1(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
	public int compare(A1 a1,A1 a2 ) {
		return a1.dept.compareTo(a2.dept);
	}
	
}
public class task1 {
	public static void main(String xyz[]) {
		A1[] a=new  A1[3];
		a[0]=new A1(1,"from","cse");
		a[1]=new A1(5,"hello","ece");
		a[2]=new A1(2,"abc","eee");
		Arrays.sort(a,new A1());
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getDept());
		}
		
		
	}

}
