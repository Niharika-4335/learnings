package learn;
import java.util.*;
class Student{
	int id;
	String name;
	 Student(int id,String name) {
		 this.id=id;
		 this.name=name;	
	}
}
public class hello {
	public static void main(String args[]) {
		ArrayList<Student> a=new ArrayList<>();
		Student s=new Student(1,"hi");
		Student s1=new Student(2,"hello");
		a.add(s1);
		a.add(s);
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			Student s3=(Student)itr.next();
			System.out.println(s3.id + " "+s3.name);
		}
	}
	
	

}
