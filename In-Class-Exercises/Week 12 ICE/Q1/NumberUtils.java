import java.util.*;

public class NumberUtils {
    public static Map<Integer, Integer> calculateFrequency(int arr[]) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], 1);
            } else {
                int old = hashMap.get(arr[i]);
                hashMap.replace(arr[i], old, old + 1);
            }
        }
        return hashMap;

    }

    public static int[] createArray(Map<Integer, Integer> freqMap) {
        if (freqMap == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer x : freqMap.keySet()) {
            for (int i = 0; i < freqMap.get(x); i++) {
                arr.add(x);
            }
        }
        int retArr[] = new int[arr.size()];
        for (int i = 0; i < retArr.length; i++) {
            int value = arr.get(i).intValue();
            retArr[i] = value;
        }
        return retArr;

    }

    public static int max(int input[]) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException();
        }
        int maxValue = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > maxValue) {
                maxValue = input[i];
            }
        }
        return maxValue;

    }

    public static int max(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static List<Pair> findPairs(int[] arr, int value) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<Pair>();
        }
        List<Pair> retList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == value && i < j) {
                    Pair p = new Pair(arr[i], arr[j]);
                    retList.add(p);

                }
            }
        }
        return retList;
    }

    public static int findTheMissingNumber(int[] arr, int n) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        int missingValue = 0;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                }
            }
            if (!found) {
                missingValue = i;
                break;
            }
        }
        return missingValue;
    }
}
