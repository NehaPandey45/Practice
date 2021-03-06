

import java.io.Serializable;
import java.util.List;

public class PrototypeMessage implements Serializable{
    private static int instance;
    private transient final Integer messageId;
    private final String message;
    private final List<String> listAddress;

    public PrototypeMessage(int messageId, String message, List<String> listAddress) {
        this.messageId = messageId;
        this.message = message;
        this.listAddress = listAddress;
        instance ++;
    }

    @Override
    public String toString() {
        return "messageId=" + messageId + " instance =  " + instance + ", message=" + message + ", listAddress=" + listAddress;
    }
}