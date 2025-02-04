package learn;
import java.util.*;
public class Stringbuilder {
	public static  void main(String xyz[]) {
	StringBuilder s=new StringBuilder("niharika");
	s.append("hi");
	System.out.println(s);
	s.insert(2,"n");
	System.out.println(s);
	//delete have 2 arguments start and end
	//reverse simply reverses the string
	s.toString();
	s.reverse();
	s.append("hello");
	s.insert(7,"z");
	System.out.println(s);
	String[] a=new String[]{"one","two","three"};
	String b="";
	for(String i:a) {
		b=b+i;
	}
	
	System.out.println(b);
	String e = "This is a good day to code";
	System.out.println(e.startsWith("This"));
	//it checks whether the word starts from given index.
	System.out.println(e.startsWith("good",10));
	String text = "one two three two one";
	//replace,replaceFirst
	String text1=text.replaceAll("one", "six");
	System.out.println(text1);
	//formatted in java13 at the %s position the new string will be formatted.
	String input = "Hello %s";
	String output1 = input.formatted("World");
	System.out.println(output1);
	}

}
