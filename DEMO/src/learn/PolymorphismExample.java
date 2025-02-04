package learn;

public class PolymorphismExample {
	//method overrloading example of compile time polymorphism
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}		
public static void main(String xyz[]) {
		PolymorphismExample p=new PolymorphismExample();
		int x=p.add(3, 5);
		int y=p.add(2, 3,5);
		double z=p.add(3.5, 4.5);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
