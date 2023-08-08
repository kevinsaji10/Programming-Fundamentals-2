import java.util.HashMap;
import java.util.Map;

public class MaxOccurrences {
    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        int highestValue = Integer.MIN_VALUE;
        int highest = Integer.MIN_VALUE;
        for (Integer i : map.keySet()) {
            if (map.get(i) > highestValue) {
                highest = i;
                highestValue = map.get(i);
            }
        }
        return highestValue;
    }
}
