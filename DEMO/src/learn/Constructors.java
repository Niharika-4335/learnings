package learn;

public class Constructors {
	    private int a;
	    private int b;

	    // Constructor 1: Takes two parameters and initializes both 'a' and 'b'
	   /* public Constructors(int a, int b) {
	        this.a = a;
	        this.b = b;
	        System.out.println("Constructor 1: a = " + a + ", b = " + b);
	    }

	    // Constructor 2: Takes one parameter and calls Constructor 1
	    public Constructors(int a) {
	        this(a, 10);  // Calls Constructor 1 with 'a' and default value 10 for 'b'
	        System.out.println("Constructor 2: a = " + a);
	    }

	    // Constructor 3: No parameters, calls Constructor 2
	    public Constructors() {
	        this(5);  // Calls Constructor 2 with a default value of 5 for 'a'
	        System.out.println("Constructor 3: No parameters");
	    }*/


	    private int number = 0;

	    public  Constructors() {
	    	 System.out.println("hi");
	    }

	    public Constructors(int theNumber) {
	        this.number = theNumber;
	        System.out.println(number);
	    }
	    public static void main(String[] args) {
	        // Calling the no-argument constructor
	        Constructors obj = new Constructors(5);
	    }


}
