/*
 * Name    :
 * Email ID:
 */
public class Q1 {

    //main method
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

    }//end of main method


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
        if (number < 10) {
            return -1;
        }
        String strNumber = "" + number;

        int smallest = (strNumber.charAt(0) - '0') * 10 + (strNumber.charAt(1) - '0');


        for (int i = 1; i < strNumber.length() - 1; i++){
            int first = strNumber.charAt(i) - '0';
            int second = strNumber.charAt(i+1) - '0';

            int pair = first * 10 + second;
            if (pair < smallest){
                smallest = pair;
            }

        }
        return smallest;
    }
    //until here


} 