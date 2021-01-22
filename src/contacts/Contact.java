package contacts;

public class Contact extends ContactInfo {

    // Attributes
    private Person person;

    // Constructor
    public Contact(Person person) {
        this.person = person;
    }

    public String contactInfo() {
        return info;
    }

    public String contactInfoType() {
        return type;
    }

    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}

