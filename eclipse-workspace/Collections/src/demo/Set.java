package demo;

//import java.awt.print.Book;
//import java.io.InvalidClassException;
//import java.util.HashSet;
import java.util.TreeSet;

public class Set {

 

	public static void main(String[] args)  {

		TreeSet<Integer> mySet=new TreeSet<Integer>();

		mySet.add(5);
		mySet.add(3);
		mySet.add(7);
		mySet.add(2);

		for(Integer o:mySet) {

			System.out.println(o);;

		}

	}

}

 
