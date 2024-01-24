//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person p1 = new Person();
        Service s1 = new Service();
        AddressBook addr=new AddressBook();
        s1.setValues(p1);
        addr.contactList.put(1,p1);
        System.out.println(s1.display(p1));
        System.out.println(addr.contactList);

    }
}