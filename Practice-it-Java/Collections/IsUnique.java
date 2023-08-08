import java.util.Map;

public class IsUnique {
    public boolean isUnique(Map<String, String> map) {
        for (String s: map.keySet()) {
            for (String x : map.keySet()) {
                if (!s.equals(x) && map.get(s).equals(map.get(x))) {
                    return false;
                }

            }
            
        }
        return true;
    }
}
