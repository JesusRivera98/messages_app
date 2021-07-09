import java.util.Scanner;

public class messagesService {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your message");
        String message = sc.nextLine();

        System.out.println("Your name");
        String name = sc.nextLine();

        Messages record = new Messages();
        record.setMessages(message);
        record.setMessage_author(name);

        MessagesDAO.createMessageDB(record);
    }
    public static void listMessages(){
        MessagesDAO.readMessagesDB();
    }
    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Indicates the ID of the message to be deleted");
        int message_id = sc.nextInt();

        MessagesDAO.deleteMessageDB(message_id);
    }
    public static void editMessage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your new message");
        String message = sc.nextLine();

        System.out.println("Indicates the ID of the message to be updated");
        int message_id = sc.nextInt();

        Messages update = new Messages();
        update.setMessage_id(message_id);
        update.setMessages(message);

        MessagesDAO.updateMessageDB(update);
    }
}
