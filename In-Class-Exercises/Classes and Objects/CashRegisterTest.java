import java.util.Scanner;

public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the first item: ");
        double purchase = sc.nextDouble();
        cashRegister.registerPurchase(purchase);

        System.out.print("Enter the price of the first item: ");
        double purchase1 = sc.nextDouble();
        cashRegister.registerPurchase(purchase1);

        System.out.print("Enter dollars recieved from customer: ");
        int dollars = sc.nextInt();

        System.out.print("Enter cents recieved from customer: ");
        int cents = sc.nextInt();

        cashRegister.makePayment(dollars, cents);
        System.out.println("Total cost of purchase: $" + cashRegister.getPurchaseAmt());
        System.out.println("Change due: $" + cashRegister.giveChange());
        sc.close();

    }
}
