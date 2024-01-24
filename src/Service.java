public class Service {
    public String display(Person p) {
        return p.getFirstName() + " " + p.getLastName() +
                " " + p.getCity() + " " + p.getState() + " " + p.getPhone() + " " + p.getZip() + " " + p.getEmail() + " " + p.getAddress();
    }

}
