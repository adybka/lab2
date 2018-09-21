import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> book;
	
	public AddressBook() {
		this.book = new ArrayList<BuddyInfo>();
	}
	

	public void addBuddy(BuddyInfo newAdd) {
		this.book.add(newAdd);
	}
	
	public void removeBuddy() {
		this.book.remove(book.size()-1);
		System.out.println("asdasd");
	}
	
	public static void main(String[] args){
		System.out.println("Address Book");
		
		BuddyInfo buddy = new BuddyInfo("Steve", 15, "123123");
		AddressBook addBook = new AddressBook();
		addBook.addBuddy(buddy);
		addBook.removeBuddy();
	}

}
