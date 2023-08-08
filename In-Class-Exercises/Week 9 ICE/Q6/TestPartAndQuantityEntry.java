import java.util.Scanner;

public class TestPartAndQuantityEntry {
    public static void main(String[] args) {
        boolean isValid = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter part: ");
            int part = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            try {
                PartAndQuantityEntry p = new PartAndQuantityEntry();
                p.enterPartAndQuantity(part, quantity);
                isValid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!isValid);
    }
}
