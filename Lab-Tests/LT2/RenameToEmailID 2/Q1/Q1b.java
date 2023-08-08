/*
 * Name:
 * Email ID:
 */

import java.util.*;

public class Q1b {
    public static double percent(long[] numbers, boolean isOdd) {
        return 0;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        { // test case 1
            long[] inputs =  {6, 2};
            boolean isOdd = true;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:0.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        { // test case 2
            long[] inputs =  {6, 2, 9, 11, 3};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:40.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        { // test case 3
            long[] inputs =  {6, 2, 9, 11, 3, 4};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:50.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        { // test case 4
            long[] inputs =  {6, 2, 9, 11, 3, 33};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:33.3");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        { // test case 5
            long[] inputs =  {};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:0.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        { // test case 6
            long[] inputs =  null;
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:0.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
    }
}
