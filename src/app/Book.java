package app;

public class Book {

	public String bookName;
	public int quantity;
	public int lendQuantity;
	
	public Book() {
		
	}

	public Book(String bookName, int quantity, int lendQuantity) {
		super();
		this.bookName = bookName;
		this.quantity = quantity;
		this.lendQuantity = lendQuantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getLendQuantity() {
		return lendQuantity;
	}

	public void setLendQuantity(int lendQuantity) {
		this.lendQuantity = lendQuantity;
	}

	public void displayBook() {
		System.out.println("Book's name: " + bookName + ", Quantity: " + quantity + ",lending: " + lendQuantity);
	}

	public int remainingBook() {
		return quantity - quantity;
	}
}
