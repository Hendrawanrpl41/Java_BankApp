package bisnis;

import java.sql.SQLException;

import persentation.Form;

public class Menu {
	Form formData = new Form();
	Search search = new Search();
	Read showData = new Read();
	int choiceSub,choiceMain;
	
	public void SubMenuAccount(int choiceSub) {
		this.choiceSub = choiceSub;
		
		switch (choiceSub) {
		case 1:
			formData.account();
			break;
		case 2 :
			showData.account();
			break;
		case 3:
			formData.accountSearch();
			break;
		case 4:
			formData.accounttDelete();
			break;
		case 0 :
			formData.mainMenu();
			break;
		default:
			break;
		}
	}
	public void SubMenuCustomer(int choiceSub) throws SQLException {
		this.choiceSub = choiceSub;
		
		switch (choiceSub) {
		case 1 :
			formData.customer();
			break;
		case 2 :
			formData.customerView();
			break;
		case 3:
			formData.customertSearch();
			break;
		case 4:
			formData.customertDelete();
			break;
		case 0 :
			formData.mainMenu();
			break;
		default:
			break;
		}
	}
	public void SubMenuTransaction(int choiceSub) {
		this.choiceSub = choiceSub;
		
		switch (choiceSub) {
		case 1 :
			formData.transaction();
			break;
		case 2 :
			showData.transaction();
			break;
		case 3:
			formData.transactionSearch();
			break;
		case 4:
			formData.accounttDelete();
			break;
		case 0 :
			formData.mainMenu();
			break;
		default:
			break;
		}
	}
	
	public void MainMenu(int choiceMain) {
		this.choiceMain = choiceMain;
		switch (choiceMain) {
		case 1:
			formData.subMenuCustomer();
			break;
		case 2:
			formData.subMenuAccount();
			break;
		case 0:
			formData.mainMenu();
			break;
		case 3:
			formData.subMenuTransaction();
			break;

		default:
			break;
		}
		
	}
}
