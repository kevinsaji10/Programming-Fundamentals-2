import java.util.*;
public class MarkLength4 {
    public static void markLength4(ArrayList<String> list) {
        for (int i = 0; i<list.size(); i++) {
            String currentString = list.get(i);
            if (currentString.length() == 4) {
                list.add(i, "****");
                i+=1;
            }
        }
    }
}
