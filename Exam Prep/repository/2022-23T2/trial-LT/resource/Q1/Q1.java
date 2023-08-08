/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */
 
public class Q1 {
    public static void main(String[] args){


        System.out.println("Expected:23");
        System.out.println("Actual  :" + getSmallestPair(2345));

        System.out.println();
        System.out.println("------------");
        System.out.println();
        System.out.println("Expected:2");
        System.out.println("Actual  :" + getSmallestPair(10245));

        System.out.println();
        System.out.println("------------");
        System.out.println();

        System.out.println("Expected:-1");
        System.out.println("Actual  :" + getSmallestPair(1));
        System.out.println();
        System.out.println();

    }


    /*
     * Write the method getSmallestPair such that it takes in an integer say n
     * and returns an integer.
     *
     * The integer returned should be the number that is
     * the SMALLEST of all possible pairs formed from the input n
     * and that which appears consecutively
     *
     * For example if n is 2345, the possible pair of digits are 23, 45, 34
     * Another example: if n is 10245, the possible pair of digits are 10,24, 2(02),45
     */
    public static int getSmallestPair(int number){
        // insert your code here.
        if (number < 10) {
            return -1;
        }
        int smallest_pair = number % 100;
        while (number > 9) {
            if (smallest_pair > number % 100) {
                smallest_pair = number % 100;
            }
            number = number / 10;
        }

        return smallest_pair; // to make this code compile. Please modify accordingly!
    }


} 