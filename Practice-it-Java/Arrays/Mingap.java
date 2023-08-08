public class Mingap {
    public int mingap(int[] arr) {
        if (arr.length  <= 1) {
            return 0;
        }
        int minDiff = arr[1] - arr[0]; 
        for (int i = 0; i<arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff < minDiff) { 
                minDiff = diff;
            }
        }
        return minDiff;
    }
}