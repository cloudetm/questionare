package oopsz.intx.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtility {
 private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
            	Class.forName("org.postgresql.Driver");
            	connection = DriverManager.getConnection("jdbc:postgresql://ec2-54-246-90-92.eu-west-1.compute.amazonaws.com:5432/d9mrn46eorepep?" + 
						  "user=bzdtuziwmvulqs&password=yF1Wk3fzAc3cyW3xyehWB-oy1z&" + 
						  "ssl=false&sslfactory=org.postgresql.ssl.NonValidatingFactory");
            	System.out.println("Successfully Connected!");
            }
            catch (SQLException e) {
            	System.out.println("Connection Failure!");
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }
}
