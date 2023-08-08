import java.util.ArrayList;

// Write a method minToFront that takes an ArrayList of integers as a parameter
// and that moves the minimum value in the list to the front, otherwise
// preserving the order of the elements. For example, if a variable called list
// stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make this call:
// minToFront(list); it should store the following values after the call: {2, 3,
// 8, 92, 4, 17, 9} You may assume that the list stores at least one value

public class MinToFront {
    public static void minToFront(ArrayList<Integer> inputArr) {
        int minValue = inputArr.get(0);
        int minIndex = 0;
        for (Integer i : inputArr) {
            if (i <minValue) {
                minValue = i;
                minIndex = inputArr.indexOf(minValue);
            }
        }
        inputArr.remove(minIndex);
        inputArr.add(0, minValue);
    }
}
