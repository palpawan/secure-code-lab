import java.sql.*;

public class SQLInjectionDemo {
    public static void main(String[] args) throws Exception {
        String userInput = args[0];
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }
}
