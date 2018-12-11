package bisnis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import data.ConnectionDatabase;
import persentation.Form;

public class Create {
	
	//customer
	String cus_id, phone_type,  phone_num,pass, user,bith_date, f_name, l_name;
	//account
	String acc_id,open_date,balace;
	//transaction
	String trx_id,type,amount,amount_sign;
	//koneksi database
	ConnectionDatabase konek = new ConnectionDatabase();
	
	//customer
	public String customer(String cus_id, String phone_type, String phone_num,String pass,String user,String bith_date,String f_name,String l_name) {
		this.cus_id = cus_id;
		this.phone_type = phone_type;
		this.phone_num = phone_num;
		this.pass = pass;
		this.user = user;
		this.bith_date = bith_date;
		this.f_name = f_name;
		this.l_name = l_name;
		try {
			String query = "insert into customer values('"+cus_id+"','"+phone_type+"','"+phone_num+"','"+pass+"','"+user+"','"+bith_date+"','"+f_name+"','"+l_name+"')";
			
			PreparedStatement hasil = konek.conn().prepareStatement(query);
			hasil.executeUpdate();
			return "data input success\\n";
		} catch (Exception e) {
			return "fail input";
		}
	}
	//account
	public String account(String acc_id,String open_date, String balance,String cus_id) {
		this.acc_id = acc_id;
		this.open_date = open_date;
		this.balace = balance;
		this.cus_id = cus_id;
		try {
			
			String query = "insert into account values('"+acc_id+"','"+open_date+"','"+balance+"','"+cus_id+"')";
			PreparedStatement hasil = konek.conn().prepareStatement(query);
			hasil.executeUpdate();
			return"data input success\\n";

		} catch (Exception e) {
			return "fail input";
		}	
		
	}
	
	//transaction
		public String transaction(String trx_id,String type, String amount,String amount_sign,String acc_id) {
			this.trx_id = trx_id;
			this.type = type;
			this.amount = amount;
			this.amount_sign = amount_sign;
			this.acc_id = acc_id;
			try {
				String query = "insert into transaction values('"+trx_id+"','"+type+"','"+amount+"','"+amount_sign+"','"+acc_id+"')";
				PreparedStatement hasil = konek.conn().prepareStatement(query);
				hasil.executeUpdate();
				return "data input success\n";

			} catch (Exception e) {
				return "fail input";
			}	
			
		}
}
