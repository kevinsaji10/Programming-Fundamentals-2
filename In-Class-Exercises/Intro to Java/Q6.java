import java.util.*;
import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
        sc.close();
    }

    // This method returns true if str2 can be aligned with str1
    // and false otherwise. If there is an alignment, this method
    // also prints out the alignment. See the sample runs of the
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        // index 1 tracks str1 (longer)
        int index1 = 0;
        // index 2 tracks str2 (shorter)
        int index2 = 0;
        // count determines if an alignment is possible
        int count = 0;
        // initalise a resizable array of characters
        ArrayList<Character> newArr = new ArrayList<>();
        while (index2 <= str2.length() - 1) {
            // check if the char of string 2 is present in the string1 and insert spaces
            // while they do not match
            while (index1 <= str1.length() - 1 && str1.charAt(index1) != str2.charAt(index2)) {
                newArr.add(' ');
                index1++;
            }
            // if matching char is present, increase index1, count, index2
            // and add char at index2 into newArr
            if (index1 <= str1.length() - 1) {
                newArr.add(str2.charAt(index2));
                count++;
                index2++;
                index1++;
            } else {
                return false;
            }
        }
        // if count matches the length of str2
        if (count == str2.length()) {
            // initialise a new string aligned
            String aligned = new String();
            // concatenate each character in newArr to form aligned
            for (Character character : newArr) {
                aligned = aligned + character;
            }
            System.out.println(str1);
            System.out.println(aligned);
            return true;

        }
        return false;
    }

}
