import java.util.ArrayList;

public class AddressBook {
	
	static ArrayList<BuddyInfo> book = new ArrayList<BuddyInfo>();
	

	public static void addBuddy(BuddyInfo newAdd) {
		book.add(newAdd);
	}
	
	public static void removeBuddy() {
		book.remove(book.size()-1);
	}

}
