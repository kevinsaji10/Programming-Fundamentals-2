import java.util.*;
public class PriceIsRight {
    public static int priceIsRight(int[] arr, int price) {
        int[] arr1 = arr.clone();
        Arrays.sort(arr1);
        int minDiff = price - arr1[0];
        if (minDiff < 0) {
            return -1;
        }
        int bid = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= price && price - arr1[i] < minDiff) {
                minDiff = price - arr1[i];
                bid = arr1[i];

            }
        }
        return bid;
    }
}
