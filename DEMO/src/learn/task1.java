package learn;
import java.util.*;
class A1 {
	private Integer id;
	private String name;
	private String dept;
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
//		List<A1> a2=new ArrayList<>(Arrays.asList(a));
//		for(A1 value1:a2) {
//			System.out.print(value1.getId());
//			System.out.print(value1.getName());
//			System.out.print(value1.getDept());
//		}
		Comparator<A1> cm1=(a3,a4)->{ return a3.getId().compareTo(a4.getId());};
		
//		Collections.sort(a2,cm1);
//		for(A1 value:a2) {
//			System.out.print(value.getId());
//		}
		Arrays.sort(a,cm1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i].getId());
		}
		
		
		
	}

}
