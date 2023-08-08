//import java.lang.reflect.Array;
import java.util.*;

public class MatrixRepresentation {
    private static int indexOf(String[] names, String target) {
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static int countFriends(int[][] ary, String[] names, String target) {
        int position = indexOf(names, target);

        int count = 0;
        for (int i = 0; i < ary.length; i++) {
            count += ary[position][i];
        }
        return count;
    }

    public static String[] commonFriends(int[][] ary, String[] names, String friend1, String friend2) {
        int f1 = indexOf(names, friend1);
        int f2 = indexOf(names, friend2);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < ary.length; i++) {
            if (ary[f1][i] == 1 && ary[f2][i] == 1) {
                result.add(names[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    public static Map<Integer, List<String>> getSociableStats(int[][] ary, String[] names) {
        Map<Integer, List<String>> result = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            int total = countFriends(ary, names, names[i]);

            List<String> container = result.get(total);
            if (container == null) {
                container = new ArrayList<>();
                result.put(total, container);
            }
            container.add(names[i]);
        }


        return result;
    }

}