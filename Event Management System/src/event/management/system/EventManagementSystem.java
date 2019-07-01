
package event.management.system;
import java.sql.*;


public class EventManagementSystem {
    private static final String Username = "root";
    private static final String Password = "";
    private static final String Conn_String = "jdbc:mysql://localhost:8889/rad";
    public static void main(String[] args) {
        Connection Conn = null;
        
        try {
            Conn = DriverManager.getConnection(Conn_String,Username,Password);
            System.out.println("Connected");
            Statement stmt = (Statement) Conn.createStatement();
            int no_participants = 3;
            String place = "a";
            String services = "s";
            int cost = 33;
        } catch (Exception e) {
            System.err.println(e);
        }

    }

}
