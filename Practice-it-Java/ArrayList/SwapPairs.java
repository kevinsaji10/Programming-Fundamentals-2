import java.util.*;
public class SwapPairs { 
    public static ArrayList<String> swapPairs(ArrayList<String> inputArr)  {
        int length;
        if (inputArr.size() %2 != 0) {
            length = inputArr.size() -1;
        } else {
            length = inputArr.size();
        }
        for (int i = 0; i<length;i = i+2) {
            String temp1 = inputArr.get(i);
            inputArr.remove(i);
            inputArr.add(i+1,temp1);
            
        }
        return inputArr;
    }
}