import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class reverse {
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
        // split each row and extract each number as a string, then print each row out
        // in reverse order.
        for (String s : sArr) {
            String[] str = s.split(",");
            for (int j = str.length - 1; j > 0; j--) {
                System.out.print(str[j] + ",");
            }
            System.out.print(str[0]);
            System.out.println();

        }
        sc.close();
    }

}
