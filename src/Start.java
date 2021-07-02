import java.sql.Connection;

public class Start {
    public static void main(String[] args) {
        ConnectionC connection = new ConnectionC();

        try(Connection cnx = connection.getConnection()) {

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
