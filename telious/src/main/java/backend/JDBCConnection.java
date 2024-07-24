package backend;

import java.sql.*;

public class JDBCConnection {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://192.168.18.245:3306/javadb_168","javadb_168","Sp3cJa5A2k24");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}