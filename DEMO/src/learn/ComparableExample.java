package learn;

import java.util.*;

//comparable used in sorting based on single element uses compareto method
class Employee1 implements Comparable<Employee1> {
	int id;
	String name;

	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Employee1 emp1) {
		System.out.println("inside the compare method");
		return Integer.compare(this.id, emp1.id);
	}
}

public class ComparableExample {
	public static void main(String xyz[]) {
		Employee1[] emp = new Employee1[3];
		emp[0] = new Employee1(2, "honey");
		emp[1] = new Employee1(1, "frooti");
		emp[2] = new Employee1(3, "hi");
		Arrays.sort(emp);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].id);
		}

	}

}
