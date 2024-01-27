import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


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
    public void addNewContact(Person p){
        contactList.put(p.getFirstName(),p);
    }
    public List<Person>displayAll(){
        return new ArrayList<>(contactList.values());
    }
    public Person giveFirstName(String fn){
        return contactList.get(fn);
    }



}
