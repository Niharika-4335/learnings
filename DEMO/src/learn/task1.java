package learn;
import java.util.*;
class A1 {
	private Integer id;
	private String name;
	private String dept;
	public A1() {
		super();
	}
	public A1(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
}
public class task1 {
	public static void main(String xyz[]) {
		A1[] a=new  A1[3];
		a[0]=new A1(1,"from","cse");
		a[1]=new A1(5,"hello","ece");
		a[2]=new A1(2,"abc","eee");
		Comparator<A1> cm1=(a1,a2)->{ return a1.getId().compareTo(a2.getId());};
//		Arrays.sort(a,);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getDept());
		}
	//it should sort every field but why integer type is not sorting.	
		
	}

}
