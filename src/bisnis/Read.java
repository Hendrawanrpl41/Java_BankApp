package bisnis;

import java.lang.annotation.Retention;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.ConnectionDatabase;
import data.Customer;
import persentation.Form;

public class Read {
	ConnectionDatabase konek = new ConnectionDatabase();
	Form formDate = new Form();
	//customer
		public List<Customer> getList() throws SQLException {
			System.out.println("ini read");
				List<Customer> list = new ArrayList<>();
				String query = "select *from customer";
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				ResultSet data = hasil.executeQuery();
				while (data.next()) {
					Customer customer = new Customer();
					customer.setBirthDate(data.getDate("brithDate"));
					customer.setCustomerNumber(data.getInt("customerNumber"));
					customer.setFirstName(data.getString("firstName"));
					customer.setLastName(data.getString("lastName"));
					customer.setPhoneType(data.getString("phoneNumber"));
					customer.setPhoneType(data.getString("phoneType"));
					customer.setUsername(data.getString("username"));
					customer.setPassword(data.getString("password"));
					
					list.add(customer);
				}
				hasil.close();
				data.close();
				return list;
		}
		//account
		public void account() {
			try {
				
				String query = "select *from account";
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				ResultSet data = hasil.executeQuery();
				while (data.next()) {
					System.out.println("|Accoun Number   : "+data.getString("accountNumber"));
					System.out.println("|Open Date       : "+data.getString("openDate"));
					System.out.println("|Balance         : "+data.getString("balance"));
					System.out.println("|Customer Number : "+data.getString("customerNumber"));
					System.out.println("----------------------------------------------------\n");
					
					
				}
				formDate.subMenuAccount();
			} catch (Exception e) {
				System.out.println("fail");
			}	
			
		}
		//transaction
			public void transaction() {
				try {
					String query = "select *from transaction";
					PreparedStatement hasil = konek.conn().prepareStatement(query);
					ResultSet data = hasil.executeQuery();
					while (data.next()) {
						System.out.println("|Id Transaction : "+data.getString("id"));
						System.out.println("|Type           : "+data.getString("type"));
						System.out.println("|Amount         : "+data.getString("amount"));
						System.out.println("|Amount Sign    : "+data.getString("amountSign"));
						System.out.println("|Account Number : "+data.getString("accountNumber"));
						System.out.println("-------------------------------------------------\n");
						
					}
					formDate.subMenuTransaction();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("fail transa");
				}	
				
			}
}
