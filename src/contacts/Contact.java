package contacts;

public class Contact{

    // 1) Instance Variables
    protected Person person;
    protected ContactInfo contactInfo;

    // 2) Class Constructor
    public Contact(Person person, ContactInfo contactInfo) {
        this.person = person;
        this.contactInfo = contactInfo;
    }

}

