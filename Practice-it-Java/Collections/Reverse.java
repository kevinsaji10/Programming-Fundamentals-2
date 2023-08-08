import java.util.HashMap;
import java.util.Map;

public class Reverse {
    public Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> ret = new HashMap<>();
        for (Integer i : map.keySet()) {
            if (!ret.containsKey(map.get(i))) {
                ret.put(map.get(i), i);
            }
        }
        return ret;
    }
}
