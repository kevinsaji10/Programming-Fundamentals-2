/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */
import java.util.*;

public class Q1e {
    /*
     * Write the method getTermGPA
     */
    public static double getTermGPA(String input) {
        // insert your code here.

        return 0.0;
        // to make this code compile. Please modify accordingly!
    }
    
    public static void main(String[] args) {
        int tcNum = 1;
        {
            System.out.println("-------------------------------------------------------");
            String input = "A1B1C1";
            double answer = getTermGPA(input);
            System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
            System.out.println("Expected :3.0");
            System.out.println("Actual   :" + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            String input = "ABC";
            double answer = getTermGPA(input);
            System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
            System.out.println("Expected :3.0");
            System.out.println("Actual   :" + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            String input = "AB0.5C";
            double answer = getTermGPA(input);
            System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
            System.out.println("Expected :3.0");
            System.out.println("Actual   :" + answer);
            System.out.println("-------------------------------------------------------");
        }
    }
}