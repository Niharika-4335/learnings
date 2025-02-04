package learn;
class  parent {
	String name="honey";
	public parent(){
		 System.out.println("parent c");
	}
	public void dance() {
		 System.out.println("dancing");
	}
		
	}
 class child extends parent {
	 String name="honey1";
	 public child() {
		 super();
		System.out.println("child c");
	 }
  void printName() {
	  //super keyword is used to access the immediate parent class methods constructors and variables.
	 System.out.println(super.name);
	 System.out.println(name);	 
 }
  public void dance() {
	     super.dance();
		 System.out.println("dancing in child class");
	}
 }
 public class SuperKeyword{
 public static void main(String xyz[]) {
	 child a=new child();
	 a.printName();
	 a.dance();
 }


}
