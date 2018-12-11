package persentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import bisnis.Create;
import bisnis.Delete;
import bisnis.Login;
import bisnis.Menu;
import bisnis.Read;
import bisnis.Search;
import data.Customer;

public class Form {
	
	String nama;
	
	Create tambah = new Create();
	Search search = new Search();
	Delete delete = new Delete();
	Scanner inputKey = new Scanner(System.in);
	Login auth = new Login();

//	view
	public void customerView() throws SQLException{
		
		Read read = new Read();
		List<Customer> isi = read.getList();
		for ( Customer e : isi) {
			System.out.println("|Customer Number : "+e.getCustomerNumber());
			System.out.println("|Phone Type      : "+e.getPhoneType());
			System.out.println("|Phone Number    : "+e.getPhoneNumber());
			System.out.println("|Password        : "+e.getPassword());
			System.out.println("|Username        : "+e.getUsername());
			System.out.println("|Birth Date      : "+e.getBirthDate());
			System.out.println("|First Name      : "+e.getFirstName());
			System.out.println("|Last Name       : "+e.getLastName());
			System.out.println("------------------------------------------------\n");
			
			
		}
		subMenuCustomer();
		
	}
	
	public void customer() {
		
		System.out.println("=====Form Customer======");
		System.out.print("Customer Number : ");
		String CusNum = inputKey.next();
		System.out.print("Phone Type   : ");
		String phoneType = inputKey.next();
		System.out.print("Phone Number : ");
		String phoneNumber = inputKey.next();
		System.out.print("Password : ");
		String password = inputKey.next();
		System.out.print("Username : ");
		String username = inputKey.next();
		System.out.print("Birth Date : ");
		String birthDate = inputKey.next();
		System.out.print("First Name : ");
		String fName = inputKey.next();
		System.out.print("Last Name : ");
		String lName = inputKey.next();
//		tambah.customer(CusNum,phoneType,phoneNumber,password,username,birthDate,fName,lName);
		String hasil = tambah.customer(CusNum,phoneType,phoneNumber,password,username,birthDate,fName,lName);
		System.out.println(hasil);
		subMenuCustomer();
	}
	public void account() {
		System.out.println("=======Form Account======");
		System.out.print("Account Number : ");
		String accNum = inputKey.next();
		System.out.print("Open Date : ");
		String openDate = inputKey.next();
		System.out.print("Balance : ");
		String balance = inputKey.next();
		System.out.print("Customer Number : ");
		String cusNum = inputKey.next();
		String hasil = tambah.account(accNum, openDate, balance, cusNum);
		System.out.println(hasil);
		subMenuAccount();
	}
	public void transaction() {
		System.out.println("=======Form Transaction====");
		System.out.print("Transaction Id : ");
		String tranId = inputKey.next();
		System.out.print("Type : ");
		String type = inputKey.next();
		System.out.print("Amoun : ");
		String amount = inputKey.next();
		System.out.print("Amount Sign : ");
		String amountSign = inputKey.next();
		System.out.print("Account Number : ");
		String accNum = inputKey.next();
		String hasil = tambah.transaction(tranId,type,amount,amountSign,accNum);
		System.out.println(hasil);
		subMenuTransaction();
	}
	
//	SEARCH
	//account
	public void accountSearch() {
		System.out.println("Input Key word : ");
		String keyWord = inputKey.next();
		String hasil = search.account(keyWord);
		System.out.println(hasil);
		subMenuAccount();
	}
	//customer
	public void customertSearch() {
		System.out.println("Input Key word : ");
		String keyWord = inputKey.next();
		String hasil = search.customer(keyWord);
		System.out.println(hasil);
		subMenuCustomer();
	}
	//transaction
	public void transactionSearch() {
		System.out.println("Input Name : ");
		String keyWord = inputKey.next();
		String hasil = search.transaction(keyWord);
		System.out.println(hasil);
		subMenuTransaction();
	}
	
//	delete
	//customer
		public void customertDelete() {
			System.out.println("Input Customer Number : ");
			String keyWord = inputKey.next();
			String hasil = delete.customer(keyWord);
			System.out.println(hasil);
			subMenuCustomer();
		}
	//account
		public void accounttDelete() {
			System.out.println("Input Customer Number : ");
			String keyWord = inputKey.next();
			String hasil = delete.account(keyWord);
			System.out.println(hasil);
			subMenuCustomer();
		}
	//account
		public void transactiontDelete() {
			System.out.println("Input Customer Number : ");
			String keyWord = inputKey.next();
			String hasil = delete.transaction(keyWord);
			System.out.println(hasil);
			subMenuCustomer();
		}
	
//	Menu Utama
	public void mainMenu() {
		System.out.println("=========Main Menu========");
		System.out.println("1. Customer");
		System.out.println("2. Account");
		System.out.println("3. Transaction");
		System.out.println("0. Exit");
		System.out.print("Choice Your Option : ");
		try {
			int choice = inputKey.nextInt();
			Menu optionMenu = new Menu();
			optionMenu.MainMenu(choice);
		} catch (Exception e) {
			System.out.println("data gagal");
		}
		
		
	}
	
//	Sub Menu Account
	public void subMenuAccount() {
		System.out.println("=========Account Menu========");
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Search Data");
		System.out.println("4. Delete Data");
		System.out.println("0. Back");
		System.out.print("Choice Your Option : ");
		try {
			int choice = inputKey.nextInt();
			Menu optionMenu = new Menu();
			optionMenu.SubMenuAccount(choice);
		} catch (Exception e) {
			System.out.println("data gagal");
		}
		
		
	}
//	Sub Menu customer
	public void subMenuCustomer() {
		
		System.out.println("=========Customer Menu========");
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Search Data");
		System.out.println("4. Delete Data");
		System.out.println("0. Back");
		System.out.print("Choice Your Option : ");
		try {
			int choice = inputKey.nextInt();
			Menu optionMenu = new Menu();
			optionMenu.SubMenuCustomer(choice);
		} catch (Exception e) {
			System.out.println("data gagal");
		}
		
		
	}
//	Sub Menu Transaction
	public void subMenuTransaction() {
		System.out.println("=========Transaction Menu========");
		System.out.println("1. Input Data");
		System.out.println("2. Show Data");
		System.out.println("3. Search Data");
		System.out.println("4. Delete Data");
		System.out.println("0. Back");
		System.out.print("Choice Your Option : ");
		try {
			int choice = inputKey.nextInt();
			Menu optionMenu = new Menu();
			optionMenu.SubMenuTransaction(choice);
		} catch (Exception e) {
			System.out.println("data gagal");
		}
		
		
	}
//	Login
	public void login() {
		
		System.out.println("===========LOGIN============");
		try {
			System.out.print("Username  : ");
			String username = inputKey.next();
			System.out.print("Password  : ");
			String password = inputKey.next();
			auth.sign(username, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}
	
	
}
