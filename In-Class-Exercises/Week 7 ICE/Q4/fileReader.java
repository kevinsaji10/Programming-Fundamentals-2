import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class fileReader {
    public static void main(String[] args) {
        boolean isInvalid = true;
        Scanner sc;
        ArrayList<String> sArr = new ArrayList<>();

        do {
            // scanner object sc for reading input from console
            sc = new Scanner(System.in);
            System.out.print("Enter filename> ");
            String filename = sc.nextLine();
            // scanner object fileSc for reading input from file (when written in try() no
            // need for sc.close())
            try (Scanner fileSc = new Scanner(new File(filename))) {
                // stores every row as as tring in an arrayList
                while (fileSc.hasNext()) {
                    String s = fileSc.next();
                    sArr.add(s);
                }
                isInvalid = false;

            } catch (FileNotFoundException e) {
                System.out.println(filename + " is invalid");
            }
        } while (isInvalid);
        // split each row and extract each number as a string, then sum up the numbers
        // of each row and print to console.
        int sumNumbers = 0;
        double sumValue = 0.00;

        for (String i : sArr) {
            String[] str = i.split(",");

            for (int j = 0; j < str.length; j += 3) {
                sumNumbers += Integer.parseInt(str[j]);
                sumValue += Integer.parseInt(str[j]) * Double.parseDouble(str[j + 2]);
                System.out.printf("There are %d %s, each cost $%.2f", Integer.parseInt(str[j]), str[j + 1],
                        Double.parseDouble(str[j + 2]));
                System.out.println();

            }
        }
        System.out.printf("There are %d products with a total value of $%.2f to be sold.", sumNumbers, sumValue);
        System.out.println();
        sc.close();
    }

}
