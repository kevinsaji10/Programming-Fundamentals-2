import java.util.*;
public class MaxLength {
    public static int maxLength(Set<String> set) {
        String longestString = "";
        for(String s : set) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
        return longestString.length();
    }
}
