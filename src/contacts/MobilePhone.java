package contacts;

public class MobilePhone extends Phone implements TextMessageEnabled, AudioMessageEnabled {

    // 1) Class Constructor
    public MobilePhone(String phone){
        super(phone);
    };


    // 3) Instance Methods

    // 3.1) Overriding Parent Methods
    @Override
    public void sendMessage(String msg) {
        this.sendTextMessage(msg);
    }
    // 3.2) Implementing Interface Methods
    public void sendTextMessage(String msg) {
        System.out.println("Message from " + this.phone + ": " + msg);
    }
    public void sendAudioMessage(Audio msg) {
        System.out.println("Message from " + this.phone + ": " + msg.toString());
    }
}
