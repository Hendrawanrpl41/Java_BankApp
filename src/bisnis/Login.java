package bisnis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import data.ConnectionDatabase;
import persentation.Form;

public class Login {
	String user,pass;
	ConnectionDatabase konek = new ConnectionDatabase();
	
//	login
	public void sign(String user, String pass) {
		this.user = user;
		this.pass = pass;
		try {
		Form formData = new Form();
			String query = "select *from login";
			PreparedStatement hasil = konek.conn().prepareStatement(query);
			ResultSet data = hasil.executeQuery();
			while (data.next()) {
				if(user.equals(data.getString("username")) && pass.equals(data.getString("password"))) {
					System.out.println("login success");
					formData.mainMenu();
				}	
			}
			System.out.println("login failed");
			formData.login();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
