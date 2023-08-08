public class CashRegister {
    private int purchase;
    private int payment;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void registerPurchase(double amount) {
        purchase += amount * 100;
    }

    public void makePayment(int dollars, int cents) {
        payment += dollars * 100 + cents;
    }

    public double getPurchaseAmt() {
        return purchase / 100.0;
    }

    public double giveChange() {
        return (payment - purchase) / 100.0;
    }
}
