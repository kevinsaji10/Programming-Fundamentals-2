
public class CountInRange {
    public int countInRange(int[] arr, int min, int max) {
        int count = 0;
        for (int i : arr) {
            if (i <= max && i >= min) {
                count++;
            }
        }
        return count;
    }
}
