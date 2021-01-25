package contacts;

public class Email extends ContactInfo implements TextMessageEnabled{

    // 1) Instance Variables
    protected String email;

    // 2) Class Constructor
    public Email(String email){
        this.email = email;
    };

    // 3) Instance Methods

    // 3.1) Implementing Abstract Methods
    public String contactInfo() {
        return this.email;
    }
    public String contactInfoType() {
        return "e-mail";
    }
    public void sendMessage(String msg) {
        this.sendTextMessage(msg);
    }

    // 3.2) Implementing Interface Methods
    public void sendTextMessage(String msg) {
        System.out.println("Message from " + this.email + ": " + msg);
    }
}
