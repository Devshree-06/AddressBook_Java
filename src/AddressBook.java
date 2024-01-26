import java.util.HashMap;

public class AddressBook {
    HashMap<String,Person> contactList=new HashMap<>();

    public Person giveContact(String personid){
        return contactList.get(personid);
    }
    public boolean deleteContact(String personid, AddressBook ad) {
        if (ad.contactList.containsKey(personid)) {
            System.out.println(ad.contactList.keySet());
            ad.contactList.remove(personid);
            System.out.println("Contact which is deleted is: " + personid);
            System.out.println(ad.contactList.keySet());
            return true;
        }
        else {
            System.out.println("Contact not found");
            return false;
        }
    }



}
