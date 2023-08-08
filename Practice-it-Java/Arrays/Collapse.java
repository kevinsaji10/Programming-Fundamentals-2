import java.util.*;
public class Collapse {
    public int[] collapse(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< arr.length-1; i+=2) {
            list.add(arr[i] + arr[i+1]);
        }
        
        if (arr.length % 2 != 0) {
            list.add(arr[arr.length -1]);
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i<list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
