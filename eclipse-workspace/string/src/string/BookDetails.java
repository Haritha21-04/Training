package string;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) throws InvalidDataException {
		// TODO Auto-generated method stub
		int bookNo;
		String title,author,category;
		float price;
		Book myBook=null;
		try {
			myBook = new Book(101,"OOP in Java","Ricky",4500);
			System.out.println(myBook.toString());
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EngineeringBook book=new EngineeringBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book No ");
		bookNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book title ");
		title=sc.nextLine();
		System.out.println("Enter Author ");
		author=sc.nextLine();
		System.out.println("Enter Price ");
		price=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Category ");
		category=sc.nextLine();
		book.setBookNo(bookNo);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		book.setCategory(category);
		System.out.println(book.toString());
		
		//Instantiate the array
		Book books[]=new Book[3];
		for(int i=0;i<3;i++) {		
			System.out.println("Enter Book No ");
			bookNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Book title");
			title=sc.nextLine();
			System.out.println("Enter Author");
			author=sc.nextLine();
			System.out.println("Enter Price");
			price=sc.nextFloat();
			//Instantiating the Book i.e array element
			books[i]=new Book(bookNo,title,author,price);
		}
		System.out.println("Book Details");
		//Iterate the array & print the details
		for(Book book1:books) {
			System.out.println(book1.toString());
		}
		System.out.println("No of instances:"+Book.getBookCount() );
		System.out.println("Enter Book No to search");
		bookNo=sc.nextInt();
		boolean found=false;
		for(Book book1:books) {
			if(book1.getBookNo()==bookNo) {
				found=true;
				System.out.println(book1.toString());
			}
		}
		if(!found) System.out.println("Book does not exist");
		sc.close();
	}

}
