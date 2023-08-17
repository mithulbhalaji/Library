package library;

import java.util.ArrayList;
import java.util.List;

public class StudentMember extends LibraryMember{
	private String type;
	private List<LibraryItem> borrowedItems = new ArrayList<>();    

	public StudentMember(int memberID, String name) {
		super(memberID, name);
		this.type = "Student";
	}



	@Override
	void borrowItem(LibraryItem item) {
		borrowedItems.add(item);
	}
	
	//getters and setters

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<LibraryItem> getBorrowedItems() {
		return borrowedItems;
	}
	@Override
	public void returnItem(LibraryItem item) {
		if(borrowedItems.contains(item)) {
			borrowedItems.remove(item);
		}else {
			System.out.println("The item is not borrowed");
		}
	}

}
