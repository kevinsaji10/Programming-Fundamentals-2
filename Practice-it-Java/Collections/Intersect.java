import java.util.*;

public class Intersect {
    public Map<String, Integer> intersect(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> ret = new HashMap<>();
        for (String s : m1.keySet()) {
            if (m1.get(s).equals(m2.get(s))) {
                ret.put(s, m1.get(s));
            }
        }
        return ret;
    }
}
