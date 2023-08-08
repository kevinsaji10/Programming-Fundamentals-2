// controller class containing the logic for bank transfer
public class PortalController {
	private Bank bank; // store all accounts in the bank
	// constructor

    public PortalController() {
        bank = new Bank();
    }


    // Write your answer below.
    public boolean transfer(String fromAccNum, String toAccNum, double amount) {
        Account from = bank.retrieveAccount(fromAccNum);
        Account to = bank.retrieveAccount(toAccNum);
        double fromBalance = from.getBalance();
        if (fromBalance >= amount) {
            from.deduct(amount);
            to.add(amount);
            return true;
        }
        return false;
        
    }
}