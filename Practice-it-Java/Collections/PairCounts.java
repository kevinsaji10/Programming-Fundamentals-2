
// use for each 2 characters in a row, find number of occurrences in the word.
import java.util.*;

public class PairCounts {
    public Map<String, Integer> pairCounts(List<String> list) {
        Map<String, Integer> map = new TreeMap<>();
        for (String s : list) {
            // tracker map to keep track if it is the first time the 2 char str is being counted for within the string
            Map<String, Integer> tracker = new HashMap<>();
            for (int i = 0; i < s.length() - 1; i++) {
                String currenti = s.substring(i, i + 2);
                tracker.putIfAbsent(currenti, 0);
                tracker.replace(currenti, tracker.get(currenti) + 1);
                // if it is the first time the 2 char is being counted for the string
                if (tracker.get(currenti) == 1) {
                    for (int j = i; j < s.length() - 1; j++) {
                        String currentj = s.substring(j, j + 2);
                        if (currenti.equals(currentj)) {
                            map.putIfAbsent(currenti, 0);
                            int old = map.get(currenti);
                            map.replace(currenti, old + 1);
                        }
                    }
                }
            }
        }
        return map;
    }
}
