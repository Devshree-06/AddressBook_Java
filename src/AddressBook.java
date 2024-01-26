import java.util.HashMap;

public class AddressBook {
    HashMap<String,Person> contactList=new HashMap<>();

    public Person giveContact(String personid){
        return contactList.get(personid);
    }



}
