package string;

class EngineeringBook extends Book {

    private String category;

 

    public EngineeringBook(int bookNo, String title, String author, float price, String category) throws InvalidDataException {

        super(bookNo, title, author, price);

        this.category = category;

    }

 

    public EngineeringBook() {
		// TODO Auto-generated constructor stub
	}



	public String getCategory() {

        return category;

    }

 

    public void setCategory(String category) {

        this.category = category;

    }

}