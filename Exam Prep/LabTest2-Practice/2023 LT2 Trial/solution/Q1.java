
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1Sol {

    public static long[] contains(long[] arr, long target) {
        if (arr == null) {
            return new long[0];
        }
        String targetStr = "" + target;

        List<Long> result = new ArrayList<>();
        for (long l : arr) {
            String value = "" + l;

            if (value.contains(targetStr)) {
                result.add(l);
            }

        }

        return result.stream().mapToLong(x->x).toArray();
    }
    public static void main(String[] args) {
        int tcNum = 1;
        {
            long[] nums = {23, 123, 231, 4123, 23, 321, 132, 2134};
            long target = 23;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[23, 123, 231, 4123, 23]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = {1234, 231, 33, 45, 3216, 123456, 10001230};
            long target = 3;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[1234, 231, 33, 3216, 123456, 10001230]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = {1234, 231, 33, 45, 3216, 123456, 10001230};
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
