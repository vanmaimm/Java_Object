package app;

public class Main {
	 public static void main(String[] args) {
		 Book book = new Book();
		 book.bookName= "Book 1";
		 book.quantity = 15;
		 book.lendQuantity = 10;
		 
		 book.displayBook();
		 
		 System.out.print("Remaining Book"+ book.remainingBook());
		 
	 }
}
