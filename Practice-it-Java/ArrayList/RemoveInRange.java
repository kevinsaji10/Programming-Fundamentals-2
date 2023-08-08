import java.util.ArrayList;
import java.util.*;
public class RemoveInRange {
    public static ArrayList<Integer> removeInRange(ArrayList<Integer> inputArr, int element, int start, int end) {
        Iterator<Integer> iterator = inputArr.iterator();
        int counter = 0;
        while(iterator.hasNext()) {
            int currentInt = iterator.next();
            if ((counter >= start && counter < end) && currentInt == element) {
                iterator.remove();
            }
            counter++;
        }
        return inputArr;
    }
}

