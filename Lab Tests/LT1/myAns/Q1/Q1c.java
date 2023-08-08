/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q1c {
    /*
     * Write the method getMostCommonVowel
     */
    public static int numOfvowelInString(char c, String s) {
        int count = 0;
        for (int i = 0; i< s.length(); i++) {
            int value = s.charAt(i) - c;
            if (value == 0 || value == -32 || value == 32) {
                count++;
            }
        }
        return count;
    }
    public static ArrayList<Character> getMostCommonVowel(ArrayList<String> inputs) {
        // insert your code here.
        char best = '0';
        ArrayList<Character> cArr = new ArrayList<>();
        cArr.add('a');
        cArr.add('e');
        cArr.add('i');
        cArr.add('o');
        cArr.add('u');
        ArrayList<Character> finArr = new ArrayList<>();
        int maxtotalNumOfVowel = 0;
        for (Character c : cArr) {
            int totalNumOfVowel = 0;
            for (String s : inputs) {
                totalNumOfVowel += numOfvowelInString(c.charValue(), s);
            }
            if (totalNumOfVowel >= maxtotalNumOfVowel) {
                maxtotalNumOfVowel = totalNumOfVowel;
                best = c.charValue();
                
                
            }
            
            
        }
        

        if (maxtotalNumOfVowel == 0) {
            return finArr;
        }
        finArr.add(best);
        return finArr;

        
        
        
        
        
         // to make this code compile. Please modify accordingly!
    }

    public static void main(String[] args) {
    
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("Abate", "Facet", "Pen", "idiom"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [e]");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("ace", "ANT", "Pen", "idiom"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [a, e]");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("pygmy", "crypt", "lymph", "psych"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : []");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
    }
}