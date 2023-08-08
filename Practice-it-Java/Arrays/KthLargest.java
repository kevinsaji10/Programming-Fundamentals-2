package Arrays;
import java.util.*;
public class KthLargest {
    public static int kthLargest(int k , int[] a)  {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< a.length; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);
        int ret = 0;
        for (int i = 0; i<list.size(); i++) {
            if (list.size() -1 -k == i) {
                ret = list.get(i);
            }
        }
        return ret;
    }
}
