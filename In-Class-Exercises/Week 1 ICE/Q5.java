import java.util.Scanner;

public class Q5 {
    public void partA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        char letter = 'a';
        for (int i = 0; i < size; i++) {
            if (i % 26 == 0) {
                letter = 'a';
            }
            System.out.print(letter);
            System.out.print(" ");
            letter++;
        }
        sc.close();
    }

    public void partB() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        for (int i = 1; i < size + 1; i++) {
            System.out.print(""+ i + (i+1) + (i+2));
            System.out.print(" ");
        }
        sc.close();
    }

    public void partC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j< i+1; j++) {
                System.out.print("" + j);
            }
            System.out.println();
        }
        sc.close();

    }

    public static void main(String[] args) {
        Q5 q5 = new Q5();
        // q5.partA();
        //q5.partB();
        q5.partC();

    }
}