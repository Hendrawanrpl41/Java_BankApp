package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDatabase {

	public static final Connection conn() {
		Connection conn = null;
		try {
			//buat koneksi
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db_bankapp", "root", "");
			
//			System.out.println("connected");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fail");
		}
		return conn;
	}
}
