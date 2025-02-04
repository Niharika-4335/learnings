package learn;

public class CallByValue{
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

}//it doesnt  swap because in java values are passed in methods through call by value.so only copies of values are swappin resulting in not swapping.
