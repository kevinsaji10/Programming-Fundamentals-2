import java.util.*;

public class Q8BinaryToText {
    public static String binaryToText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary message: ");
        String binaryStr = sc.nextLine();
        // create output string that will store text
        String output = "";
        int index = 0;
        // loop through the original binary string and isolate every 8 bits
        while (index + 8 <= binaryStr.length()) {
            // slice 8 bits from the right of the binary string and store in string variable sliced
            String sliced = binaryStr.substring(index, index + 8);
            // set decimal value of letter stored in letter to 0
            int letter = 0;
            // iterate through the 8 bits and find the decimal value of the letter
            for (int i = 0; i < sliced.length(); i++) {
                letter += (sliced.charAt(i) - '0') * Math.pow(2, 7 - i);
            }
            // convert to char and concatenate with output
            output += (char) letter;
            // increase index by 8
            index = index + 8;

        }
        sc.close();
        return output;

    }

    public static void main(String[] args) {
        System.out.println(binaryToText());
    }
}