import java.util.HashMap;
import java.util.Map;

public class Contains3 {
    public boolean contains3(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        for (String s: map.keySet()) {
            if (map.get(s) >= 3) {
                return true;
            }
        }
        return false;
    }
}
