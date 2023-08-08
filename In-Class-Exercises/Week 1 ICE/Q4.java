import java.util.Scanner;

public class Q4 {
    // function to resize array
    public int[] resizeArray(int[] arr, int newLength, int value) {
        int[] newArray = new int[newLength];
        // copying original array to new array
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        // add the new value at the end
        newArray[newArray.length - 1] = value;
        return newArray;

    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        Scanner sc = new Scanner(System.in);
        int length = 0;
        int[] numArr = new int[0];
        boolean cond = true;
        // resize array until negative number is entered
        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if (n >= 0) {
                length++;
                numArr = q4.resizeArray(numArr, length, n);

            } else {
                cond = false;
            }
        } while (cond);
        // if only 1 number is entered and is negative, print output and exit
        if (numArr.length == 0) {
            System.out.println("No positive number is entered.");
        } else {
            // else, multiply numbers in array
            int prdt = numArr[0];
            for (int i = 1; i < numArr.length; i++) {
                prdt *= numArr[i];
            }
            System.out.println(prdt);
        }
        sc.close();
    }
}