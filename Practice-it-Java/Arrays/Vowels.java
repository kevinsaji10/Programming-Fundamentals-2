public class Vowels {
    public static int[] vowelCount(String str) {
        int[] ret = new int[5];
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        char[] arr1 = str.toCharArray();
        for (int i = 0; i< arr.length; i++) {
            int counter = 0;
            for (int j = 0; j< arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    counter++;
                }
            }
            ret[i] = counter;
        }
        return ret;
    }
}
