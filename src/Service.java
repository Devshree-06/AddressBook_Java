import java.util.Scanner;


public class Service {
    public String display(Person p) {
        return p.getFirstName() + " " + p.getLastName() +
                " " + p.getCity() + " " + p.getState() + " " + p.getPhone() + " " + p.getZip() + " " + p.getEmail() + " " + p.getAddress();
    }
    public void setValues(Person p){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name");
        String fn=scan.next();
        p.setFirstName(fn);
        System.out.println("Enter last name");
        String ln=scan.next();
        p.setLastName(ln);
        System.out.println("Enter city name");
        String c=scan.next();
        p.setCity(c);
        System.out.println("Enter state name");
        String st=scan.next();
        p.setState(st);
        System.out.println("Enter phone name");
        int ph=scan.nextInt();
        p.setPhone(ph);
        System.out.println("Enter zip name");
        int z=scan.nextInt();
        p.setZip(z);
        System.out.println("Enter email name");
        String e=scan.next();
        p.setEmail(e);
        System.out.println("Enter address name");
        String addr=scan.next();
        p.setAddress(addr);



    }

}
