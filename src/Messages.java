public class Messages {
    int message_id;
    String messages;
    String message_author;
    String message_date;

    public Messages() {
    }

    public Messages(int message_id, String messages, String message_author, String message_date) {
        this.messages = messages;
        this.message_author = message_author;
        this.message_date = message_date;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getMessage_author() {
        return message_author;
    }

    public void setMessage_author(String message_author) {
        this.message_author = message_author;
    }

    public String getMessage_date() {
        return message_date;
    }

    public void setMessage_date(String message_date) {
        this.message_date = message_date;
    }
}
