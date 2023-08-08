
// copy of q3 code
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
        for (String i : sArr) {
            String[] str = i.split(",");
            int sum = 0;
            for (int j = 0; j < str.length; j++) {
                sum += Integer.parseInt(str[j]);
            }
            System.out.println(sum);
        }
        sc.close();
    }

}
