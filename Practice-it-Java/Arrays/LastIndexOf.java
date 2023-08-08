public class LastIndexOf {
    // find last index where value is
    public int lastIndexOf (int[] arr, int value) {
        int index = -1;
        for (int i  = 0; i< arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }
}