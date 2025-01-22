package learn;

import java.util.*;

class Employee2 implements Comparator<Employee2> {
	int id;
	String name;

	public Employee2() {
		super();
	}

	public Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compare(Employee2 emp1, Employee2 emp2) {
		return emp1.name.compareTo(emp2.name);
	}
}

public class comparator {
	public static void main(String xyz[]) {
		Employee2[] emp = new Employee2[3];
		emp[0] = new Employee2(2, "honey");
		emp[1] = new Employee2(1, "frooti");
		emp[2] = new Employee2(3, "hi");
		Arrays.sort(emp, new Employee2());
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].name);
		}

	}

}
