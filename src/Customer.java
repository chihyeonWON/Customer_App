import java.sql.Connection;
import java.sql.DriverManager;

public class Customer {
	public static void main(String[] args) {
		getConnection();
	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5473430";
			String user = "sql5473430";
			String password = "cRmtCjyP4L";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("The Connection Successful");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
