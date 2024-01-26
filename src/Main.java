import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person p1 = new Person();
        Service s1 = new Service();
        Scanner scan=new Scanner(System.in);
        AddressBook addr =new AddressBook();
        s1.setValues(p1);
        System.out.println(s1.display(p1));
        System.out.println(addr.contactList);
        String newcontact=p1.getFirstName();
        addr.contactList.put(newcontact,p1);
        Person newp=addr.giveContact(newcontact);
        s1.editInput(newp,addr);
        System.out.println(s1.display(newp));
        System.out.println(addr.contactList);
        //remove function to delete entry.. .contains to find the particular element to delete or update
        //.contains(element) find this element in the hashmap and update or delete it.
        //find thru contains,then remove it and then update the new entry with put method






    }
}