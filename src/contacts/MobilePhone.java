package contacts;

public class MobilePhone extends Phone implements TextMessageEnabled, AudioMessageEnabled {

    // 1) Class Constructor
    public MobilePhone(String phone){
        super(phone);
    };


    public void sendAudioMessage(Audio msg) {

    }


    public void sendTextMessage(String msg) {
        System.out.println("Message from " + this.email + ": ");
        this.sendMessage(msg);
    }
}
