import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {

    public static void createMessageDB(Messages message) {
        ConnectionC db_connect = new ConnectionC();

        try (Connection connection = db_connect.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO messages (message, message_author) VALUES (?, ?);";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessages());
                ps.setString(2, message.getMessage_author());

                ps.executeUpdate();
                System.out.println("Message Created");

            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (SQLException throwables) {
            //throwables.printStackTrace();
            System.out.println(throwables);
        }

    }

    public static void readMessagesDB() {
        ConnectionC db_connect = new ConnectionC();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = db_connect.getConnection()) {

            String query = "SELECT * FROM messages";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("message_id"));
                System.out.println("Message: " + rs.getString("message"));
                System.out.println("Author: " + rs.getString("message_author"));
                System.out.println("Date: " + rs.getDate("message_date"));
                System.out.println();
            }

        } catch (SQLException throwables) {
            System.out.println("Messages couldn't be retrieved");
            //throwables.printStackTrace();
            System.out.println(throwables);
        }
    }

    public static void deleteMessageDB(int message_id) {
        ConnectionC db_connect = new ConnectionC();

        try (Connection connection = db_connect.getConnection()) {

            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM messages WHERE message_id = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, message_id);
                ps.executeUpdate();
                System.out.println("Message was deleted");

            }catch (SQLException throwables) {
                System.out.println("Message couldn't be deleted");
                System.out.println(throwables);
            }

        }catch (SQLException throwables) {
                System.out.println(throwables);
            }
    }

    public static void updateMessageDB(Messages message) {
        ConnectionC db_connect = new ConnectionC();

        try (Connection connection = db_connect.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE messages SET message = ? WHERE message_id = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessages());
                ps.setInt(2, message.getMessage_id());
                ps.executeUpdate();
                System.out.println("Message correctly updated");
            } catch (SQLException e){
                System.out.println(e);
                System.out.println("Message couldn't be updated");
            }

        }catch (SQLException throwables) {
        System.out.println(throwables);
    }
    }

}
