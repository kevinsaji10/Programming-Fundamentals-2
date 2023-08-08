import java.util.*;

public class PortalMenu {
	private PortalController pctrl;

    // constructor
	public PortalMenu(PortalController pctrl) {
		this.pctrl = pctrl;
	}

	// gets account to, account from and amount to transfer from user input and perform transfer
    public void processTransfer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Portal");
		System.out.print("Enter your account number> ");
		String fromAccNum = sc.nextLine();
		System.out.print("Enter account to transfer to> ");
		String toAccNum = sc.nextLine();
		System.out.print("Enter amount to number> ");
		double amount = sc.nextDouble();
		boolean transferred = pctrl.transfer(fromAccNum, toAccNum, amount);
		if (transferred) {
			System.out.println(amount + " is transferred from " + fromAccNum + " to " + toAccNum);
		}
		else { 
			System.out.println(fromAccNum + " has insufficient funds for transfer");
		}
		sc.close();
    }        
}