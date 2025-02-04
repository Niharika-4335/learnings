package learn;
class c{
	int id;
	int name;
	
}
public class ObjectReference {
	public static void main(String xyz[]) {
	c c1=new c();
	c1.id=2;
	c1.name=3;
	c a=c1;
	System.out.print(c1.name);
	c1.name=7;

	System.out.print(c1.name);
	System.out.print(a.name);
	
	}

}
//as the both objects c1 and a point to the same address the values even after modifying will be same.
