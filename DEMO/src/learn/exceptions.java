package learn;
import java.util.*;
public class exceptions {
	public static void main(String xyz[]) {
		int a=5,b=6;
		int c=a/b;
		try {
			if(c==0) {
				throw new ArithmeticException("exception occured");
			}
			
		}
		catch(ArithmeticException e) {
			c=a/2;
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block reached");
		}
		 System.out.println(c);
//		
		
	}

}
//if the exception doesnt occurs then it doesnt to catch block.but if there is data
//in catch block then we will use throw keyword to get into catch block.
