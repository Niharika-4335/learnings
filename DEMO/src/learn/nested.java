package learn;

class B {
	private static  int a=3;
	public static  class inner{
		private static int a=5;
		public void b() {
			System.out.print(a);
			System.out.print(B.a);
		}
		 
	 }
	
}
 public class nested{
	public static void main(String args[]) {
		//B n=new B();
		B.inner n1=new B.inner();
		n1.b();
	}

}
 /*this is non static inner class for classes like this we have to first create object for outer
 class first and then  refer to inner class using the reference variable of outer class*/
