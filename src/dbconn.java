
import java.sql.*;

public class dbconn {
    private static final String URL = "jdbc:mysql://localhost:3307/dummyjson";
    private static final String USER = "root";
    private static final String PASSWORD = "Janani@2003";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
