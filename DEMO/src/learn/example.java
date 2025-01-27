package learn;

public class example {
	public static void main(String xyz[]) {
		int a=10;
		int b=20;
		swap(10,20);
		System.out.print(a+ " "+b);
	}
	
	 public  static void  swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
