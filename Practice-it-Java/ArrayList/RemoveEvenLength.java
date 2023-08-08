// remove every element at an even index in the ArrayList
import java.util.ArrayList;
import java.util.*;
public class RemoveEvenLength {
    public static void removeEvenLength(ArrayList<String> inputArr) {
        Iterator<String> iterator = inputArr.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().length() %2 == 0) {
                iterator.remove();
            }
        }
    }
}
