import java.sql.Connection;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do{
            System.out.println("______________");
            System.out.println(" Messages App");
            System.out.println(" 1. Create message");
            System.out.println(" 2. List message");
            System.out.println(" 3. Delete message");
            System.out.println(" 4. Edit message");
            System.out.println(" 5. Exit");

            //Read user option
            option = sc.nextInt();

            switch (option){
                case 1:
                    messagesService.createMessage();
                    break;
                case 2:
                    messagesService.listMessages();
                    break;
                case 3:
                    messagesService.deleteMessage();
                    break;
                case 4:
                    messagesService.editMessage();
                    break;
                case 5:
                    break;
                default:
                    break;
            }

        }while (option != 5);
    }
}
