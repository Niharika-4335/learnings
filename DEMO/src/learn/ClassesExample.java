package learn;
class Employee{
	private int id;
	private String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
//there is a class containing fields names of people and i have to sort them by names.
public class ClassExample{
public static void main(String xyz[]) {
	Employee e=new Employee(1,"niharika");
	System.out.print(e.getId());
	System.out.print(e.getName());
	e.setId(4);
	e.setName("hello");
	System.out.print(e.getId());
	System.out.print(e.getName());
	
}
}
