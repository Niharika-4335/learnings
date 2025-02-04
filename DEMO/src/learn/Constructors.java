package learn;
//to call a constructor from another constructor we need this and we will do this mainly when we have many 
//constructors.
public class Constructors {
	    static  int id;
	    String name;
	    String msg;
	    
	    public Constructors(int id, String name, String msg) {
			this.id = id;
			this.name = name;
			this.msg = msg;
		}
	    public Constructors(String name,String msg) {
	    	this(id,name,msg);
	    	
	    }
	    public Constructors(String name) {
	    	this(name,"hello");
	    	
	    }
	    public void displayDetails() {
	    	System.out.print(id);
	        System.out.print(name);
	        System.out.print(msg);
	        
	    }


		public static void main(String[] args) {
//	        Constructors c=new Constructors(2,"niharika","msg");
//	        Constructors c1=new Constructors("xyz","msg1");
//	        c1.displayDetails();
	        Constructors c2=new Constructors("niharika");
	        c2.displayDetails();
	        
	        
	        
	    }


}
