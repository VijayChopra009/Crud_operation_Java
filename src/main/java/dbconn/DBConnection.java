package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn = null;

	public static Connection getConnection() {
		System.out.println("Getconnection.......");
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            System.out.println("Connect.............."+conn);    
		} catch (Exception e) {

		}
		return conn;
	}
	public static void main(String[] args) {
		System.out.println("\n D Connection main   "+DBConnection.getConnection());
	}

}
