import java.util.ArrayList;

public class Interleave {
    public ArrayList<Integer> interLeave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int counter = 0;
        for (int i = 0; i<a1.size(); i++) {
            a1.add(i+1, a2.get(i));
            counter++;
        }
        if (counter < a2.size()) {
            for (int i = counter; i< a2.size(); i++)  {
                a1.add(a2.get(i));
            }
        }
        return a1;
    }
}
