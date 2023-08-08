import java.util.*;

public class Q1Test {
    public static void main(String[] args) {
        int score = 0;
        {
            try {
                long[] nums = { 3, 34, 345, 3456 };
                long target = 45;
                long[] result = Q1.contains(nums, target);
                Arrays.sort(result);
                if (Arrays.toString(result).equals("[345, 3456]")) {
                    score += 1;
                } else {

                }
            } catch (Throwable e) {
                // System.out.printf(",0");
            }
        }

        {
            try {
                long[] nums = { 0, 30, 305, 3006, -1, -201 };
                long target = 0;
                long[] result = Q1.contains(nums, target);
                Arrays.sort(result);
                if (Arrays.toString(result).equals("[-201, 0, 30, 305, 3006]")) {
                    score += 1;
                } 
            } catch (Throwable e) {
                // System.out.printf(",0");
            }
        }
        {
            try {
                long[] nums = {};
                long target = 0;
                long[] result = Q1.contains(nums, target);
                Arrays.sort(result);
                if (Arrays.toString(result).equals("[]")) {
                    score += 1;
                } 
            } catch (Throwable e) {
                // System.out.printf(",0");
            }
        }
        {
            try {

                long[] nums = null;
                long target = 33333;
                long[] result = Q1.contains(nums, target);
                Arrays.sort(result);
                if (Arrays.toString(result).equals("[]")) {
                    score += 1;
                } 
            } catch (Throwable e) {
                // System.out.printf(",0");
            }
        }
        Map<Integer, Double> map = new HashMap<>();
        map.put(0, 0.0);
        map.put(1, 3.5);
        map.put(2, 4.0);
        map.put(3, 4.5);
        map.put(4, 5.0);
        System.out.print(","+map.get(score));

    }
}
