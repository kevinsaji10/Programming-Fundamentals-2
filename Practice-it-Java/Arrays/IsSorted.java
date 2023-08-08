package Arrays;
// check if array is sorted in non decureasing order
public class IsSorted {
    public static boolean isSorted(double[] arr) {
        for (int i = 0; i< arr.length-1; i++) {
            if (arr[i+1] < arr[i]) {
                return false;
            }
        }
        return true;
    }
}
