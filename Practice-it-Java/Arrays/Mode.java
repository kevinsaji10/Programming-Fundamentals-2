package Arrays;
import java.util.*;
public class Mode {
    public int mode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.putIfAbsent(i, 0);
            map.replace(i, map.get(i) +1);
        }
        int maxFreq = arr[0];
        for (Integer i :map.keySet()) {
            if (map.get(i) >= map.get(maxFreq) && map.get(i) < maxFreq) {
                maxFreq = i;
            }
        }
        return maxFreq;
    }
}
