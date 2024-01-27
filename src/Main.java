import java.util.Scanner;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //UC1-IMPLEMENTATION
        Person p1 = new Person();
        Service s1 = new Service();
        Scanner scan=new Scanner(System.in);
        AddressBook addr =new AddressBook();
        /*s1.setValues(p1);
        System.out.println(s1.display(p1));
        System.out.println(addr.contactList);
        //UC-2 IMPLEMENTATION
        String newcontact=p1.getFirstName();
        addr.contactList.put(newcontact,p1);
        Person newp=addr.giveContact(newcontact);
        //UC-3 IMPLEMENTATION
        s1.editInput(newp,addr);
        System.out.println(s1.display(newp));
        /*remove function to delete entry.. .contains to find the particular element to delete or update
        //.contains(element) find this element in the hashmap and update or delete it.
        //find thru contains,then remove it and then update the new entry with put method*/
        //UC-4 implementation
       /* System.out.println("Delete contact");
        String giveName=scan.next();
        s1.removeContact(giveName,addr);*/
        //UC5 IMPLEMENTATION

        while(true){
            System.out.println("Option 1=ADD PERSON");
            System.out.println("Option 2=DISPLAY");
            System.out.println("Option 3=EDIT CONTACT");
            System.out.println("Option 4=DELETE PERSON");
            System.out.println("Option 5=EXIT");

            int option=scan.nextInt();
            switch (option){
                case 1:
                    //adding a person
                    Person newContact=s1.setValues();
                    addr.addNewContact(newContact);
                    System.out.println("Person added successfullly");
                    break;
                case 2:
                    //display the contact
                    for(Person p:addr.contactList.values()){
                        System.out.println(s1.display(p));
                    }
                    break;
                case 3:
                    //edit contact
                    System.out.println("Enter name to be edited");
                    String newName=scan.next();
                    Person existingContact=addr.giveFirstName(newName);
                    if(newName!=null){
                        s1.editInput(existingContact,addr);
                        System.out.println("Person is edited");
                    }
                    else{
                        System.out.println("Person not found");
                    }
                    break;
                case 4:
                    //deleting the contact
                    System.out.println("Enter name to be deleted");
                    String delName=scan.next();
                    s1.removeContact(delName,addr);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");

            }

        }






    }
}