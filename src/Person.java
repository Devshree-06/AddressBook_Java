public class Person {
    private String FirstName;
    private String LastName;
    private String City;
    private String State;
    private int Phone;
    private int Zip;
    private String Email;
    private String Address;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public int getPhone() {
        return Phone;
    }

    public int getZip() {
        return Zip;
    }

    public String getEmail() {
        return Email;
    }
    public String getAddress(){
        return Address;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public void setZip(int zip) {
        Zip = zip;
    }
    public void setAddress(String address){
        Address=address;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
