
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,5,2,7};
		for (int a:arr)System.out.println(a);
		System.out.println("---");
		Array.getLength(arr);
		for(int a:arr)System.out.println(a);
		

	}

}
