package demo;

class InvalidDataException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDataException(String msg) {
		super(msg);
	}
}
public class Book {
	private static int bookCount;
	private int bookNo;
	private String title;
	public Book() {
		bookNo=0;
		title="Undefined";
		author="Unknown";
		price=(float)0.0;
		bookCount++;
	}
	
	public Book(int bookNo, String title, String author, float price) throws InvalidDataException {
		super();
		boolean valid=true;
		if(title.length()<4) {
			valid=false;
			//System.out.println("Invalid title");
			throw new InvalidDataException("Invalid title");
		}
		if(price<1 || price>5000) {
			valid=false;
			//System.out.println("Invalid price");
			throw new InvalidDataException("Invalid price");
		}
		if(!valid) return;
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		bookCount++;
	}
	public static int getBookCount() {
		return bookCount;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private String author;
	private float price;
	//methods to access the data members
	public void setBookNo(int bookNo) {
		this.bookNo=bookNo;
	}
	public int getBookNo() {
		return this.bookNo;
	}
	@Override
	public String toString() {
		return "Book NO:" +bookNo + " Title:"+
				title + " Author:" +author +
				" Price:" + price;
	}
	
}

