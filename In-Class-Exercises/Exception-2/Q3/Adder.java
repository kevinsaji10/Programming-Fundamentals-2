import java.util.InputMismatchException;
import java.util.Scanner;

// public class Adder {
//     public static int prompt(int round) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num " + round + ">");
//         int num1 = sc.nextInt();
//         return num1;
        
//     }

//     public static void main(String[] args) {
//         int sum = 0;
//         int round = 1;
//         while (round <= 2) {
//             try {
//                 sum += prompt(round);
//                 round++;
//             } catch (InputMismatchException e) {
//                 System.out.println("Please enter a number!");
//             }
//         }
//         System.out.println("The answer is " + sum);
//     }
// }

//prof solution
public class Adder {
    public static int promptForNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try{
            System.out.print(prompt);
            return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                sc.nextLine();
            }
        }

    }
    public static void main(String[] args) {
        int num1 = promptForNumber("Enter num 1>");
        int num2 = promptForNumber("Enter num 2>");
        System.out.println("The answer is " + (num1+num2));

    }
}

