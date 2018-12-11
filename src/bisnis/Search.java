package bisnis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.ConnectionDatabase;
import data.Customer;
import persentation.Form;

public class Search {

	ConnectionDatabase konek = new ConnectionDatabase();

	String keyWord;
	//customer
		public String customer(String keyWord) {
			this.keyWord = keyWord;
			try {
				
				String query = "select *from customer where username like '%"+keyWord+"%'";
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				ResultSet data = hasil.executeQuery();
				if(!data.next()) {
					return "data not found";
				}else {
					while (data.next()) {
						System.out.println("|Customer Number : "+data.getString("customerNumber"));
						System.out.println("|Phone Type      : "+data.getString("phoneType"));
						System.out.println("|Phone Number    : "+data.getString("phoneNumber"));
						System.out.println("|Password        : "+data.getString("password"));
						System.out.println("|Username        : "+data.getString("username"));
						System.out.println("|Birth Date      : "+data.getString("brithDate"));
						System.out.println("|First Name      : "+data.getString("firstName"));
						System.out.println("|Last Name       : "+data.getString("lastName"));
						System.out.println("------------------------------------------------\n");
						
					}
					return "Data Found";
				}
//				formDate.subMenuCustomer();

			} catch (Exception e) {
				// TODO: handle exception
				return "fail";
			}	
			
		}
		//account
		public String account(String keyWord) {
			this.keyWord = keyWord;
			try {
				
				String query = "select *from account where accountNumber = '"+keyWord+"'";
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				ResultSet data = hasil.executeQuery();
				if(!data.next()) {
					return "data not found";
				}else {
					while (data.next()) {
						System.out.println("|Accoun Number   : "+data.getString("accountNumber"));
						System.out.println("|Open Date       : "+data.getString("openDate"));
						System.out.println("|Balance         : "+data.getString("balance"));
						System.out.println("|Customer Number : "+data.getString("customerNumber"));
						System.out.println("----------------------------------------------------\n");
						
						
					}
					return "Data Found";
				}
			} catch (Exception e) {
				return "fail";
			}	
			
		}
		//transaction
			public String transaction(String keyWord) {
				this.keyWord = keyWord;
				try {
					String query = "select *from transaction where id = '"+keyWord+"'";
					PreparedStatement hasil = konek.conn().prepareStatement(query);
					ResultSet data = hasil.executeQuery();
					if(!data.next()) {
						return "data not found";
					}else {
						while (data.next()) {
							System.out.println("|Id Transaction : "+data.getString("id"));
							System.out.println("|Type           : "+data.getString("type"));
							System.out.println("|Amount         : "+data.getString("amount"));
							System.out.println("|Amount Sign    : "+data.getString("amountSign"));
							System.out.println("|Account Number : "+data.getString("accountNumber"));
							System.out.println("-------------------------------------------------\n");
							
						}
						return "Data Found";
					}
				} catch (Exception e) {
					return "fail";
				}	
				
			}
}
