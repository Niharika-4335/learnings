package learn;
class ex1 extends Exception{
	public ex1(String message){
		super(message);
	}
}
public class CustomExceptionExample {
	public static void main(String xyz[]) {
 try {
	  CheckAge(13);
 }
 catch(ex1 e) {
	  System.out.print(e.getMessage());
 }
 finally {
	  System.out.println("reached finally");
 }
}
public static void CheckAge(int age) throws ex1 {	
	if(age<18) {
		throw new ex1("age is not valid");
	}
}
}// this is creating a custom exceptions extend exception for checked exceptions
class ex1 extends RuntimeException{
	public ex1(String message){
		super(message);
	}
}
public class CustomExceptionExample {
	public static void main(String xyz[]) {
  try {
	  CheckAge("");
  }
  catch(ex1 e) {
	  System.out.print(e.getMessage());
  }
  finally {
	  System.out.println("reached finally");
  }
}
public static void CheckAge(String name) throws ex1 {	
	if(name.isEmpty()) {
		throw new ex1("throwing null pointer exception");
	}
}
} 
//this is creating a custom exceptions extending runtime exception for unchecked exceptions


