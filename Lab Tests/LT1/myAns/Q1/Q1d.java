/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q1d {
    /*
     * Write the method getIncreasingCharWords
     */
    public static ArrayList<String> getIncreasingCharWords(ArrayList<String> inputs) {
        // insert your code here.

        return null;
        // to make this code compile. Please modify accordingly!

    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("access", "AcT", "big", "bUy", "bird"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [access, AcT, bUy]");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("a", "dc", "ab"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [a, ab]");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("Ailment", "crate", "raid"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : []");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
    }

}