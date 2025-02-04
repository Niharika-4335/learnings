package learn;
public class ThrowExample{
	public static void agevalidation(int age) throws IllegalArgumentException{
		if(age<18) {
			throw new  IllegalArgumentException("age should be older than 18");
		}
	}
	public static void main(String xyz[]) {
		try {
		agevalidation(16);
		}
		catch(Exception a) {
			System.out.print(a.getMessage());
		}
		finally {
			System.out.print("hi im finally");
		}
		
		
}
}
//why we have to use throws here 
//if we want to create custom exception we have to extend the exception class.

