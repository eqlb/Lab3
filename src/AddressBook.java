import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> aBuddy;

    public AddressBook(){
        this.aBuddy = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddy){
        this.aBuddy.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        this.aBuddy.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
