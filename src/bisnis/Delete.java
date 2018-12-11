package bisnis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import data.ConnectionDatabase;

public class Delete {

	ConnectionDatabase konek = new ConnectionDatabase();
	String keyWord;
	//customer
		public String customer(String keyWord) {
			this.keyWord = keyWord;
			try {
				
				String query = "delete from customer where customerNumber = '"+keyWord+"'";
//				System.out.println(query);
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				hasil.executeUpdate();
				
//					
					return "delete customer number = "+keyWord+" success";
				
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
				
				String query = "delete from account where accountNumber = '"+keyWord+"'";
//				System.out.println(query);
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				hasil.executeUpdate();
				
//					
					return "delete account number = "+keyWord+" success";
				
//				formDate.subMenuCustomer();

			} catch (Exception e) {
				// TODO: handle exception
				return "fail";
			}	
			
		}
	//transaction
		public String transaction(String keyWord) {
			this.keyWord = keyWord;
			try {
				
				String query = "delete from transaction where id = '"+keyWord+"'";
//				System.out.println(query);
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				hasil.executeUpdate();
				
//					
					return "delete transaction number = "+keyWord+" success";
				
//				formDate.subMenuCustomer();

			} catch (Exception e) {
				// TODO: handle exception
				return "fail";
			}	
			
		}
}
