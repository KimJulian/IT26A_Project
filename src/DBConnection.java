import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/midterm_db", "root", "");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Oops! Database connection failed: " + e.getMessage());
        }
        return conn;
    }
}
