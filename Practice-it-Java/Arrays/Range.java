import java.util.*;
// find the range of values in the array
public class Range {
    public static int range(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j< arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr[0] - arr[arr.length -1] + 1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 3, 45, 6};
        int range = range(arr);
        System.out.println(range);
        System.out.println(Arrays.toString(arr));
    }

}
