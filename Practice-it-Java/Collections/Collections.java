import java.util.*;
public class Collections {
    public static void removeInRange(List<Integer> list, int value, int start, int end) {
        Iterator<Integer> iterator = list.iterator();
        int counter = 0;
        while(iterator.hasNext()) {
            int test = iterator.next();
            if (counter >= start && counter < end && test == value) {
                iterator.remove();
            }
            counter++;
        }
    }
}
