import java.util.*;
public class IsUnique {
    public boolean isUnique(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i< arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
