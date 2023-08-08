/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q1b {

    /*
     * Write the method getLongestPalindromeWord
     */
    public static boolean isSame(char c1, char c2) {
        if (c1 == c2 || (c1 - c2) == 32 || (c1 - c2) == -32) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPalindrome(String input) {
        int front = 0;
        int back = input.length() -1;
        while (back >= front) {
            
            if (!(isSame(input.charAt(front), input.charAt(back)))) {
                return false;
                
            }
            front++;
            back--;
        }
        return true;
    }
    public static String getLongestPalindromeWord(ArrayList<String> inputs) {
        // insert your code here.
        int longestLength = 0;
        String longest = "";
        int count = 0;
        for (String s : inputs) {
            if (isPalindrome(s)) {
                count++;
                if (s.length() > longestLength) {
                    longest = s;
                }
            }
        }
        if (count == 0) {
            return null;
        }
        return longest;
         // to make this code compile. Please modify accordingly!
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("Madam");
            inputs.add("wow");
            inputs.add("success");
            inputs.add("kayak");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : Madam");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("apple");
            inputs.add("orange");
            inputs.add("pear");
            inputs.add("kayak");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : kayak");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("abcd");
            inputs.add("cdedc");
            inputs.add("abgba");
            inputs.add("cddc");
            inputs.add("cddca");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : cdedc");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("ab");
            inputs.add("abc");
            inputs.add("abccab");
            inputs.add("abab");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : null");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
    }
}