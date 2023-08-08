import java.util.ArrayList;
import java.util.List;

public class Append {
    public int[] append(int[] a1, int[] a2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<a1.length; i++) {
            list.add(a1[i]);
        }
        for (int i = 0; i<a2.length; i++) {
            list.add(a2[i]);
        }
        int [] arr = new int[list.size()];
        for (int i = 0; i< list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
