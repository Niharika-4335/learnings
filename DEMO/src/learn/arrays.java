package learn;
import java.util.*;
public class arrays {
	public static void main(String xyz[]) {
		int[] a= {1,3,4,5,8,2};
		/*int b=3;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		int[] c=new int[a.length-1];
		for(int i=0;i<index;i++) {
			c[i]=a[i];
		}
		for(int j=index+1;j<=a.length-1;j++) {
			c[j-1]=a[j];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}*/
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int index = Arrays.binarySearch(a, 2);

		System.out.println(index);
		
		
	
		
		
	}

}
