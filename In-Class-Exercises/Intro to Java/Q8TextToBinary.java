import java.util.*;

//the program handles only positive decimals
public class Q8TextToBinary {
    public static String textToBinary() {
        // input of text message
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text message: ");
        String text = sc.nextLine();
        // create binaryStr variable which will store final output
        String binaryStr = "";
        for (int i = 0; i<text.length(); i++) {
            // decimal value of each character in the text will be stored in value
            int value = text.charAt(i);
            // int value is converted to a binary string and stored in binaryValue variable
            String binaryValue = Integer.toBinaryString(value);
            // add leading 0s until its 8 bits
            while(binaryValue.length() < 8) {
                binaryValue = "0" + binaryValue;
            }
            // concatenate strings
            binaryStr = binaryStr + binaryValue;
        }
        sc.close();
        return binaryStr;
    }
    public static void main(String[] args) {
        System.out.println(textToBinary());
    }
}