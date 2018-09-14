import java.util.ArrayList;

public class AddressBook {
	
	private static ArrayList<BuddyInfo> book = new ArrayList<BuddyInfo>();
	
	public AddressBook() {
		book = null;
	}
	

	public void addBuddy(BuddyInfo newAdd) {
		book.add(newAdd);
	}
	
	public void removeBuddy() {
		book.remove(book.size()-1);
	}
	
	public static void main(String[] args){
		System.out.println("Address Book");
		
		BuddyInfo buddy = new BuddyInfo("Steve", 15, "123123");
		AddressBook addBook = new AddressBook();
		addBook.addBuddy(buddy);
	}

}
