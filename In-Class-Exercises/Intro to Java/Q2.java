import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        boolean cond = true;
        Scanner sc = new Scanner(System.in);
        do {
            // print first word
            System.out.print("Enter first word: ");
            String s1 = sc.nextLine();
            // print second word
            System.out.print("Enter second word: ");
            String s2 = sc.nextLine();
            char c1 = s1.charAt(0);
            char c2 = s2.charAt(0);
            // compare char at 0 index
            if (c1 == c2) {
                // to exit from loop
                cond = false;
            } else {
                System.out.println("Try Again");

            }
        } while (cond);
        System.out.println("Bingo");
        sc.close();
    }
}