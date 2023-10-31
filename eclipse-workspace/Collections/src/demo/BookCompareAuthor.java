package demo;

import java.util.Comparator;



public abstract class BookCompareAuthor implements Comparator<Book> {

 

	public int compare1(Book o1, Book o2) {

		// TODO Auto-generated method stub

		return o1.getAuthor().compareTo(o2.getAuthor());

	}

	

 

}