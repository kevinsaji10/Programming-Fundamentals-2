import java.util.ArrayList;

public class RemoveShorterStrings {
    public ArrayList<String> removeShorterStrings(ArrayList<String> list) {
        for (int i = 0; i< list.size()-1; i++) {
            if (list.get(i).length() <= list.get(i+1).length()) {
                list.remove(i);
            } else {
                list.remove(i+1);
            }
        }
        return list;
        
    }
}
