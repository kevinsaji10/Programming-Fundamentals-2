import java.util.ArrayList;
import java.util.List;

public class Alternate {
    public List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        List<Integer> longer;
        List<Integer> shorter;
        if (l1.size() > l2.size()) {
            longer = l1;
            shorter = l2;
        } else {
            longer = l2;
            shorter = l1;
        }
        for (int i = 0; i<shorter.size(); i++) {
                list.add(shorter.get(i));
                list.add(longer.get(i));
                counter++;
        }
        
        for (int i = counter; i<longer.size(); i++) {
            list.add(longer.get(i));
        }
        return list;
    }
}
