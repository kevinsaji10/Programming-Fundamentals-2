// add the value at i to the arrayList at position i+1 for every element
import java.util.ArrayList;
public class DoubleList {
    public static void doubleList(ArrayList<String> inputArr) {
        for (int i = 0; i< inputArr.size(); i+=2) {
            inputArr.add(i+1, inputArr.get(i));
        }
    }
}
