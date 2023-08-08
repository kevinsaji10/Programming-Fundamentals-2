// Write a method removeDuplicates that takes as a parameter a sorted ArrayList
// of Strings and that eliminates any duplicates from the list. For example,
// suppose that a variable called list contains the following values: {"be",
// "be", "is", "not", "or", "question", "that", "the", "to", "to"} After calling
// removeDuplicates(list); the list should store the following values: {"be",
// "is", "not", "or", "question", "that", "the", "to"}

// Because the values will be sorted, all of the duplicates will be grouped
// together.
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void removeDuplicates(ArrayList<String> inputArr) {
        if (inputArr.size() == 0) {
            return;
        }
        Iterator<String> iterator = inputArr.iterator();
        // make the first string in ArrayList currentString, iterator pointer now points at first String
        String currentString = iterator.next();
        while(iterator.hasNext()) {
            // make compareString the second element of the ArrayList, iterator pointer now points to second element
            String compareString = iterator.next();
            if (currentString.equals(compareString)) {
                // remove second element, due to the rest of the elements pushed to the front,
                // the iterator pointer points to the third element
                iterator.remove();
            } else {
                // if not, the iterator pointer remains at the second element, and
                // current string is changed to the second element and the cycle continues
                currentString = compareString;
            }
        }
    }
}
