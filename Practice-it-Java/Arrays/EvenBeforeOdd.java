import java.util.ArrayList;
import java.util.List;

public class EvenBeforeOdd {
    public int [] evenBeforeOdd(int[] arr) {
        int front = 0;
        int back = arr.length-1;
        while(back > front) {
            while(arr[front] % 2 ==0 && front < back) {
                front++;
            }
            while(arr[back] % 2 !=0 && front <back ) {
                back--;
            }
            
                int temp  = arr[back];
                arr[back] = arr[front];
                arr[front] = temp;
            
        }
        return arr;
        
    }
}