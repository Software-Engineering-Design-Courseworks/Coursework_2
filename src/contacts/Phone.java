package contacts;

public class Phone extends ContactInfo implements AudioMessageEnabled{

    // 1) Class Members
    protected String phone;

    // 2) Class Constructor
    public Phone(String phone){
        this.phone = phone;
    };

    // 3) Implementing Abstract Methods
    public String contactInfo() {
        return this.phone;
    }

    public String contactInfoType() {
        return "phone";
    }

    public void sendMessage(String msg) {
        System.out.println(msg);
    }

    // 4) Implementing Interface Methods
    public void sendAudioMessage(Audio msg) {
        System.out.println("Message from " + this.phone + ": ");
        this.sendMessage(msg.toString());
    }
}
