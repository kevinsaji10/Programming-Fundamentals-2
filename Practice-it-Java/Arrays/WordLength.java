import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordLength {
    public void wordLength(Scanner file) {
        Map<Integer, Integer> map = new TreeMap<>();
        while (file.hasNextLine()) {
            String line = file.nextLine();

            String[] str = line.split(" ");
            for (String s : str) {
                if (s.length() != 0) {
                    map.putIfAbsent(s.length(), 0);
                    map.put(s.length(), map.get(s.length()) + 1);
                }
            }

        }
        for (Integer i : map.keySet()) {
            String ast = "";
            for (int j = 0; j < map.get(i); j++) {
                ast += "*";
            }
            System.out.println(i + ": " + map.get(i) + "\t" + ast);
        }
    }
}
