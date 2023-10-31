package demo;

import java.util.Comparator;



public abstract class BookCompareTitle implements Comparator<Book> {

 

	@Override

	public int compare(Book o1, Book o2) {

		// TODO Auto-generated method stub

		return o1.getTitle().compareTo(o2.getTitle());

	}

 

}