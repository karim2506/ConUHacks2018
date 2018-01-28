package twilio;


// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioMain{

    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACcfe8e7daadca282955fcbf0f228e2e38";
    public static final String AUTH_TOKEN = "4baa0837957a4c0ef5446c2f083de618";

    public static void sendmessage() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                new PhoneNumber("+18196657270"),
                new PhoneNumber("+16137063996"),
                "Your relative just called an emergency number, please check on him"
        ).create();
        System.out.println(message.getSid());

    }
}
