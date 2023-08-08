import java.util.*;
public class Stutter {
    public static List<String> stutter (ArrayList<String> list, int k ){
        if (k <= 0) {
            list.clear();
            return list;
        }
        // counter variable for outer loop (stays at first how, first are, first you etc)
        int pointer = 0;
        while(pointer < list.size()) {
            String currentValue = list.get(pointer);
            // counter variable index for inner loop
            int index = 0;
            while(index < k-1) {
                list.add(pointer + index, currentValue);
                index++;
            }
            pointer = pointer + k;
        }
        return list;
    }

}

