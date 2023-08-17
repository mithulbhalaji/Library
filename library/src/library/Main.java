package library;


public class Main {
	
	public static void main(String[] args) {
	
		
		LibraryItem book = new Book("Title",123,"Author");
		StudentMember student = new StudentMember(123,"Mithul");
		FacultyMember faculty = new FacultyMember(987,"Bhalaji");
		
		book.displayInfo();
		student.borrowItem(book);								  //Borrowing book
		student.getBorrowedItems().get(0).displayInfo();          //Getting information about borrowed items
		student.returnItem(new Book("Other book",223,"Author2")); // Book not borrowed
		student.returnItem(book);                                 //Returning the book
		
		System.out.println(student.getType());					  //Getting the type of Library Member
		System.out.println(faculty.getType());					  //Getting the type of Library Member
		
		
	}
}
