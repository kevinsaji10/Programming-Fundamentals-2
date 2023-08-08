import java.util.ArrayList;

public class FilterRange {
    public ArrayList<Integer> filterRange(ArrayList<Integer> list, int min, int max) {
        for (int i =0 ; i< list.size(); i++) {
            if(list.get(i) <= max && list.get(i) >= min) {
                list.remove(i);
                i--;
            }

        }
        return list;
    }
}
