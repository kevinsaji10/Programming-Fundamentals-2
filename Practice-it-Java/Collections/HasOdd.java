import java.util.*;
public class HasOdd {
    public static boolean hasOdd(Set<Integer> set) {
        if (set == null) {
            return false;
        }
        for (Integer s : set) {
            if (s.intValue() % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
