package learn;
class One<T>{
	 T a;

	public One(T a) {
		super();
		this.a = a;
	}

	public void display() {
		System.out.print(a);
	}
	
}

public class GenericsExample {
	public static <t> void  ExampleGeneric(t num){
		System.out.println(num);
		
	}
public static void main(String xyz[]) {
	One one=new One(123);
	one.display();
	
	One two=new One("hi");
	two.display();
	ExampleGeneric(5);
	
}
}
//
