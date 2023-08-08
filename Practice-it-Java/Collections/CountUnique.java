import java.util.HashSet;
import java.util.*;
// get the unique elements in the list
public class CountUnique {
    public int countUnique(List<Integer> list) {
        Set<Integer> set= new HashSet<>();
        for (Integer i : list) {
            if (!set.contains(i)) {
                set.add(i);
            }
        }
        return set.size();
    }
}
