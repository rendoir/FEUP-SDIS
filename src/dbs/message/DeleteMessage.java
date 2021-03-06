package dbs.message;

import dbs.utils.Constants;

import java.nio.charset.StandardCharsets;

import static dbs.utils.Constants.CRLF_D;
import static dbs.utils.Constants.SPACE;

public class DeleteMessage extends Message {
    DeleteMessage(double version, String sender_ID, String file_ID) {
        super(version, sender_ID, file_ID);
        this.messageType = Constants.MessageType.DELETE;
    }

    @Override
    public byte[] encode() {
        return (this.messageType
                + SPACE + this.version
                + SPACE + this.sender_ID
                + SPACE + this.file_ID
                + SPACE + CRLF_D).getBytes(StandardCharsets.ISO_8859_1);
    }
}
