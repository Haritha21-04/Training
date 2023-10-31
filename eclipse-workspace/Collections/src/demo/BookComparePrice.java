package demo;

import java.util.Comparator;



public abstract class BookComparePrice implements Comparator<Book> {

 

	@Override

	public int compare(Book o1, Book o2) {

		// TODO Auto-generated method stub

		if( o1.getPrice()==o2.getPrice())

			return 0;

		else if(o1.getPrice()>o2.getPrice())

			return 1;

		else

			return -1;

	}

 

}
