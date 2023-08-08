import java.util.*;
// get the common elements from both lists
public class CountCommon {
    public static int countCommon(List<Integer> l1, List<Integer> l2) {
        // stores the unique elements in set 1
        Set<Integer> set1= new HashSet<>();
        for (Integer i : l1) {
            if (!set1.contains(i)) {
                set1.add(i);
            }
        }
        // stores the common elements
        Set<Integer> set2= new HashSet<>();
        for (Integer i : l2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        
        return set2.size();
    }
}
