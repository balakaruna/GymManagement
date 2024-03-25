package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static final String url = "jdbc:mysql://localhost:3306/gym";
    public static final String username = "root";
    public static final String password = "9080";

public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	return DriverManager.getConnection(url, username, password);
	
	}

}
