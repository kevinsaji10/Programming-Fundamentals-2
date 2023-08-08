/**
 * Name :
 * Email:
 */
import java.util.*;
public class Q1 {
    public static long[] contains(long[] nums, long target) {
        if (nums == null) {
            return new long[0];
        }
        ArrayList<Long> ret = new ArrayList<>();
        // get number of digits in target
        int counter = 0;
        long copy = target;
        while (copy > 0) {
            copy = copy / 10;
            counter++;
        }
        double divisor = Math.pow(10, counter);
        for (int i = 0; i < nums.length; i++) {
            long current = nums[i];
            boolean isPresent = false;
            while (current > 0) {
                long compare = current % (long)divisor;
                if (compare == target) {
                    isPresent = true;
                }
                current = current / 10;

            }
            if (isPresent) {
                ret.add(nums[i]);
            }

        }
        long[] arr = new long[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            arr[i] = ret.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            long[] nums = { 23, 123, 231, 4123, 321, 23, 132, 2134 };
            long target = 23;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[23, 123, 231, 4123, 23]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = { 1234, 231, 33, 45, 3216, 123456, 10001230 };
            long target = 3;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[1234, 231, 33, 3216, 123456, 10001230]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = { 1234, 231, 33, 45, 3216, 123456, 10001230 };
            long target = 9;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = {};
            long target = 0;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = null;
            long target = 0;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
    }

}
