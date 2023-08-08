import java.util.*;
import java.io.*;

public class fileReader {
    public static void main(String[] args) {

        // you can put the creation of fileSc in try () because of the autoclose, you
        // dont have to
        // put the sc.close() at the end
        boolean isInvalid = true;
        int sum = 0;
        Scanner sc;
        do {
            // this scanner is to read from the terminal window
            sc = new Scanner(System.in);
            System.out.print("Enter filename> ");
            String filename = sc.nextLine();
            // this scanner is to read from a file
            try (Scanner fileSc = new Scanner(new File(filename))) {
                while (fileSc.hasNext()) {
                    sum += fileSc.nextInt();
                }
                isInvalid = false;

            } catch (FileNotFoundException e) {
                System.out.println(filename + " is invalid");
            }
        } while (isInvalid);

        System.out.println("The sum is " + sum);
        sc.close();

    }
}
