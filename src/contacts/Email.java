package contacts;

public class Email extends ContactInfo implements TextMessageEnabled{

    // 1) Class Members
    String email;

    // 2) Class Constructor
    public Email(String email){
        this.email = email;
    };

    // 3) Implementing Abstract Methods
    public String contactInfo() {
        return this.email;
    }

    public String contactInfoType() {
        return "e-mail";
    }

    public void sendMessage(String msg) {
        System.out.println(msg);
    }

    // 4) Implementing Interface Methods
    public void sendTextMessage(String msg) {
        System.out.println("Message from " + this.email + ": ");
        this.sendMessage(msg);
    }
}
