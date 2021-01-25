package contacts;

public class Phone extends ContactInfo implements AudioMessageEnabled{

    // 1) Instance Variables
    protected String phone;

    // 2) Class Constructor
    public Phone(String phone){
        this.phone = phone;
    };

    // 3) Instance Methods

    // 3.1) Implementing Abstract Methods
    public String contactInfo() {
        return this.phone;
    }

    public String contactInfoType() {
        return "phone";
    }

    public void sendMessage(String msg) {
        this.sendAudioMessage(new Audio(msg));
    }

    // 3.2) Implementing Interface Methods
    public void sendAudioMessage(Audio msg) {
        System.out.println("Message from " + this.phone + ": " + msg.toString());
    }
}
