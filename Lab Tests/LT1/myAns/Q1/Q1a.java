/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

 import java.util.*;

 public class Q1a {
     /*
      * Write the method getAsciiValue
      */
     public static ArrayList<Integer> getSumOfAsciiValue(ArrayList<String> inputs) {
         // insert your code here
         ArrayList<Integer> iArr = new ArrayList<>();
        for (String s : inputs) {
            int total = 0;
            for (int i = 0; i< s.length(); i++) {
                char current = s.charAt(i);
                if ((current >= 'A' && current <= 'Z') || current >= 'a' && current <= 'z' || current >= '0' && current <= '9') {
                    total += (int)s.charAt(i);
                    
                }
                
            }
            iArr.add(total);

        }
         return iArr;
         // to make this code compile. Please modify accordingly!
     }
 
     public static void main(String[] args) {
         int tcNum = 1;
         {
             System.out.println("-------------------------------------------------------");
             ArrayList<String> inputs = new ArrayList<>();
             inputs.add("a");
             inputs.add("b");
             inputs.add("ab");
             inputs.add("a@b+!!");
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : [97, 98, 195, 195]");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
         {
             ArrayList<String> inputs = new ArrayList<>();
             inputs.add("a");
             inputs.add("A");
             inputs.add("1");
             inputs.add("2");
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : [97, 65, 49, 50]");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
         {
             ArrayList<String> inputs = new ArrayList<>();
             inputs.add("abc123456");
             inputs.add("AB");
             inputs.add("bcd");
             inputs.add("");
             inputs.add("abc");
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : [603, 131, 297, 0, 294]");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
         {
             ArrayList<String> inputs = new ArrayList<>();
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : []");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
     }
 }