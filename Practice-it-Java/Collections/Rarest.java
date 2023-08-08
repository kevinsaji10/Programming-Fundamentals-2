import java.util.*;

public class Rarest {
    public static int rarest(Map<String, Integer> map) throws NullPointerException {
        Map<Integer, Integer> tracker = new TreeMap<>();
        Map<Integer, Integer> tracker1 = new TreeMap<>();
        for (String s : map.keySet()) {
            
            tracker1.putIfAbsent(map.get(s), 0);
            int old = tracker1.get(map.get(s));
            tracker1.put(map.get(s), old + 1);
            // System.out.println("x" + tracker1);
            // if (tracker1.get(map.get(s)) == 1) {
            //     for (String x : map.keySet()) {
            //         if (map.get(s) == map.get(x)) {
            //             tracker.putIfAbsent(map.get(s), 0);
            //             tracker.put(map.get(s), tracker.get(map.get(s)) + 1);
            //         }
            //     }
            // }
        }
        int lowest = Integer.MAX_VALUE;
        int lowestValue = Integer.MAX_VALUE;
        for (Integer i : tracker1.keySet()) {
            if (tracker1.get(i) < lowest || (tracker1.get(i) == lowest && i < lowestValue)) {
                lowestValue = i;
                lowest = tracker1.get(i);
            }
        }
        return lowestValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("a", 51);
        map.put("t", 51);
        map.put("c", 1000);
        map.put("w", 1000);
        map.put("y", 5);
        map.put("h", 5);
        System.out.println(rarest(map));
    }
}
