
import java.util.*;
public class MatrixRepresentation {
    public static int countFriends(int[][] ary, String[] names, String target) {
        int counter = 0;
        for (String s : names) {
            if (s.equals(target)) {
                break;
            } else {
                counter++;
            }
        }
        int numFriends = 0;
        for (int i = 0; i< ary.length; i++) {
            for (int j = 0; j< ary[i].length; j++) {
                if (ary[i][j] == 1 && i == counter) {
                    numFriends++;
                }
            }
        }
       return numFriends;
    }

    public static String[] commonFriends(int[][] ary, String[] names, String friend1, String friend2) {
        int counter1 = 0;
        for (String s : names) {
            if (s.equals(friend1)) {
                break;
            } else {
                counter1++;
            }
        }
        int counter2 = 0;
        for (String s : names) {
            if (s.equals(friend2)) {
                break;
            } else {
                counter2++;
            }
        }
        List<String> list = new ArrayList<>();
            for (int j = 0; j< ary[0].length; j++) {
                if (ary[counter2][j] == 1 && ary[counter1][j]== 1) {
                    list.add(names[j]);
                }
            }

        return list.toArray(new String[list.size()]);
    }

    // public static Map<Integer, List<String>> getSociableStats(int[][] ary, String[] names) {
    //     return null;
    // }

}