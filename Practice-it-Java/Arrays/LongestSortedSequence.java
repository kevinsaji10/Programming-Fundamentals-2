public class LongestSortedSequence {
    public int longestSortedSequence(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            int index = i;
            int counter = 1;
            while (isSorted && index + 1 < arr.length) {
                if (!(arr[index] <= arr[index + 1])) {
                    isSorted = false;
                } else {
                    counter++;
                    index++;
                }

            }
            if (counter > max) {
                max = counter;
            }

        }
        return max;
    }
}
